import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {userType} from '../dataType'


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})

export class ProductsComponent implements OnInit {

  //array with custom data type.
  userArray:userType[]= [];

  productArray = [
    {name:'product1.jpg',"product_name":"Vegatable","id":1},
    {name:'product2.jpg',"product_name":"Wheat","id":2},
    {name:'product3.jpg',"product_name":"Fruits","id":3},
    {name:'product4.jpg',"product_name":"Flowers","id":4},
    {name:"product5.jpg","product_name":"Sheep" ,"id":5}  
];

  constructor(private http:HttpClient) { 
    //this.getUsers();//method will be triggerd while loading of the page.
    this.getCustomers();//calling spring boot
  }

  ngOnInit() {
  }

  getUsers(){
    this.http.get("https://reqres.in/api/users?page=2").subscribe((res:userType)=>{
      this.userArray  = res['data'];//assign the server response to the variable
    })   
  }

  getCustomers(){   
    this.http.get("http://localhost:8080/customer/getCustomer").subscribe(res=>{
      console.log(res);
    })
  }
}