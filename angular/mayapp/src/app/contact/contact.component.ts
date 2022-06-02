import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  fromchild = "";
  constructor() { }

  ngOnInit() {
  }
  recvFromChild(data){
    console.log(data);//this is from child component.
    this.fromchild = data;
  }
}
