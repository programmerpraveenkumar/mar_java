import { Component, OnInit } from '@angular/core';
import { CommonService } from '../common.service';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  constructor(private common:CommonService) { }

  ngOnInit() {
  }
  publish(){
    this.common.publishMessage.next("publisher::this is message from footer");
  }
}
