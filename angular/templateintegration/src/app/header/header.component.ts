import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  @Input() currentPage = "";
  isLoggedIn = false;
  constructor(private customerService:CustomerService,private router:Router) {
    this.isLoggedIn  = (this.customerService.checkToken())?true:false;
   }

  ngOnInit() {
  }

  logout(){
    this.customerService.logout();
    this.router.navigateByUrl('login');
    //navigite to either login or home page
  }

}
