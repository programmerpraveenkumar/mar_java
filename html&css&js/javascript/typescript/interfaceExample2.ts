//creating the data type.
interface init{
   sayHI();
}

//interface method has to be declared in the class
class Message implements init{
    sayHI() {
        console.log("This is hi message for this class");
    }    
}
let message = new Message();
message.sayHI();