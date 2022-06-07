import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor() { }
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

  logout(){
    localStorage.removeItem('data');
    localStorage.removeItem('token');
    localStorage.removeItem('customer_no');
  }

}
