import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
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
  jobname = "";
  person = {name:"samplename","age":"45","email":"sample email@gmail.com"};
  userResponse = [];
  //creaet obj for httpclient  using constructor
  constructor(private http:HttpClient) { }
  

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
      alert("UserName is empty");
      return;
    }
    if(this.jobname == ""){
      alert("jobName is empty");
      return;
    }
    let req = {
        "name": this.username,
        "job": this.jobname
    }
    this.http.post("https://reqres.in/api/users",req).subscribe(
      (res:any)=>{       
        console.log(res);
        this.username = "";//clear the variable and textbox
        this.jobname = "";//clear the variable and textbox
      }
    )
  }
}
