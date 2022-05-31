import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor(private http:HttpClient) { }
  printMessage(){
    console.log("this is simple message from common service");
  }
  showAlert(message){
    alert(message); 
  }
  postApi(url,reqParam){
    
    //https://reqres.in/api/users?delay=3
   return this.http.post(url,reqParam);
  }
  getApi(url){
    return this.http.get(url);
  }
}
