import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CommonService } from '../common.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  pageName = "value is updated";
  message = "";
  age = "";
  username = "";
  password = "";
  hideOrShow = true;//
  cssClassName = "red";
  num = 2;
  num2 = 4;
  num3 = 6;
  jobname = "";
  currency = 100;
  person = {name:"samplename","age":"45","email":"sample email@gmail.com"};
  userResponse = [];
  currentDate = new Date()
  isLoaderShown = false;
  //creaet obj for httpclient  using constructor
  constructor(private http:HttpClient,private common:CommonService) { }
  

  personDetail = [
    {name:"child1","age":4},
    {name:"child2","age":10},
    {name:"sample1","age":34},
    {name:"sample2","age":35},
    {name:"sample3","age":36},
    {name:"sample4","age":37},
    {name:"sample5","age":38},
    {name:"sample6","age":39},
  ];
  cityName = [
    {name:"city1","peopleCount":400},
    {name:"city2","peopleCount":450},
    {name:"city3","peopleCount":1000},
    
  ];

  ngOnInit() {
  }

  validate(){
    if(this.username == ""){
      alert("Please enter UserName");
    }
    else if(this.password == ""){
      alert("Please enter Password");
    }else{
      alert("everything is ok ");
    }
  }

  hideOrShowMethod(){
      this.hideOrShow = !this.hideOrShow;
  }

  changeCssClassname(className:any){
    this.cssClassName = className;
  }
  callServiceMethod(){
    this.common.printMessage();//calling srevice method using object.
  }

  loadUser(){
    this.http.get("https://reqres.in/api/users?page=2").subscribe(
      (res:any)=>{
        this.userResponse  = res['data'];
        console.log(res);
      }
    )
  }
  createUser(){
    if(this.username == ""){
      this.common.showAlert("UserName is empty");//common alert from the service class.
      return;
    }
    if(this.jobname == ""){
      this.common.showAlert("jobName is empty");//common alert from the service class.
      return;
    }
    let req = {
        "name": this.username,
        "job": this.jobname
    }
    //this.http.post().subscribe(
      this.common.postApi("https://reqres.in/api/users",req).subscribe( (res:any)=>{       
        console.log(res);
        this.username = "";//clear the variable and textbox
        this.jobname = "";//clear the variable and textbox
      }
    )
  }
  showLoaderApi(){
    //this.isLoaderShown= true;
    //https://reqres.in/api/users?delay=3
    
    this.common.getApi("https://reqres.in/api/users?delay=3").subscribe(res=>{
      console.log(res);
      //this.isLoaderShown = false;
    })
  }
}
