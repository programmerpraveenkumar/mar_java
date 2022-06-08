import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-settings',
  templateUrl: './settings.component.html',
  styleUrls: ['./settings.component.css']
})
export class SettingsComponent implements OnInit {
  old_password = "";
  new_password = "";
  re_password = "";
  constructor(private customerservice:CustomerService) { }

  ngOnInit() {
  }

  passwordupdate(){
    ///if any fields are empty..show the alert with erroe message
    if(this.new_password != this.re_password){
        //throw the error
    }
    let customerId  = this.customerservice.getCustomer_id();
    let req  = {
      "old_password":this.old_password,
        "customerId":customerId,
        "new_password":this.new_password,
    }
    this.customerservice.postHttp("customer/passwordUpdate",req).subscribe(res=>{
        alert("Password updated successfully!!!");
        this.new_password = "";
        this.old_password = "";
        this.re_password = "";
    })
  }

}
