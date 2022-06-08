import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CustomerService } from '../customer.service';
import {userType} from '../dataType'
@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
  userDetail : userType = {
    id:0,
    email:'',
    first_name:'',
    last_name:'',
    avatar:''   
  };
  constructor(private customer:CustomerService ,private router:ActivatedRoute,private http:HttpClient) { 
    this.router.paramMap.subscribe(res=>{
      console.log(res['params']);
      this.getUserDetailsById(res['params']['product_id']);
    })
  }

  ngOnInit() {
  }
getUserDetailsById(userId){
  this.customer.getHttp("https://reqres.in/api/users/"+userId).subscribe((res:userType)=>{
    console.log(res);
    this.userDetail= res['data'];
  });
}
}
