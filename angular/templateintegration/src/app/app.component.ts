import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'templateintegration';
}
/*
ng g c home
ng g c about
ng g c contact
  html,css,spec.ts,ts

localhost:4200/home -> homecomponet
localhost:4200/about -> aboutcomponet
localhost:4200/contact ->contact component
*/