import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  BASE_URL = "http://localhost:8080/";//dev machine
  //BASE_URL = "http://localhost:8080/";//sit url
  //BASE_URL = "http://localhost:8080/";//uat url
  constructor(private http:HttpClient) { }
  storeCustomerStorage(data){
    localStorage.setItem('data',JSON.stringify(data));
    localStorage.setItem('token',data['token']);
    localStorage.setItem('customer_no',data['customer_no']);
  }
  checkToken(){
    let token = localStorage.getItem("token");
    if(token == "" || token == undefined){
      return false;
    }else{
      return true;
    }
  }
  getCustomer_id (){
    return localStorage.getItem("customer_no");
  }

  logout(){
    localStorage.removeItem('data');
    localStorage.removeItem('token');
    localStorage.removeItem('customer_no');
  }
  postHttp(url,req){
    let header = this.getHeader();
    return this.http.post(this.BASE_URL+url,req,{headers:header});
  }
  postHttpWithoutToken(url,req){
    return this.http.post(this.BASE_URL+url,req);
  }
  getHeader(){
    let user_id = localStorage.getItem('customer_no');
    let user_token = localStorage.getItem('token');
    let header = new HttpHeaders({
      'user_id': user_id,
      'token': user_token
    })
    console.log("header ",header);
    return header;
  }
  getHttp(url){
    let header = this.getHeader();
    return this.http.get(this.BASE_URL+url,{headers:header});
  }

}
