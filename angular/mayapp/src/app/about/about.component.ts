import { Component, OnInit } from '@angular/core';
import { CommonService } from '../common.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {

  constructor( private common:CommonService) { 
    this.common.publishMessage.subscribe(res=>{
      console.log(res);
    })
  }

  ngOnInit() {
  }
  callServiceMethod(){
    this.common.printMessage();//calling srevice method using object.
    this.common.showAlert("common alert message");
  }
}
