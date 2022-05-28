//creating the data type.
interface Person{
    firstName:string,
    lastName:string
}

//using data type
var john:Person ={
    firstName:"john",
    lastName:"geek"
} 
console.log(john.firstName+" -- "+john.lastName);