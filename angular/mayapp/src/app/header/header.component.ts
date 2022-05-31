import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  //recv the value from the parent
  @Input() fromParent = "";
  constructor() { }

  ngOnInit() {
  }

}
