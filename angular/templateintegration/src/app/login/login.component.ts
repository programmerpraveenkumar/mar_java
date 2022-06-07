import { HttpClient } from '@angular/common/http';
import { ThrowStmt } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  email:"";
  password:"";
  userResponse = "";
  constructor(private http:HttpClient,private customerService:CustomerService,private router:Router) { }

  ngOnInit() {
  }
  login(){
    this.userResponse  = "";
    //if email is empty show the alert
    //if password id emtpy show the alert.
    //belwo is for server request objec.
    let req = {
      email:this.email,
      password:this.password
    }
    
    this.http.post("http://localhost:8080/customer/login",req).subscribe((res:any)=>{
      console.log(res);
     this.customerService.storeCustomerStorage(res);
      this.userResponse = "you are correct";
      this.router.navigateByUrl('home');
    },err=>{
      console.log(err);

      this.userResponse = "you are wrong.";
    })

  }

}
