import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { CommonService } from '../common.service';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  //recv the value from the parent
  @Input() fromParent = "";
  @Input() menuname = ""
  @Output() toParent = new EventEmitter();//import from angular core
  constructor(private common:CommonService) {
    this.common.publishMessage.subscribe(res=>{
      console.log(res);//from the publisher
    })
   }

  ngOnInit() {
  }

  clickToSendParent(){
    this.toParent.emit("sample message to parent");
  }

}
