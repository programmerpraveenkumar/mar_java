class Parent{
        printMessage(message){
            console.log("this is parent method ",message);
        }
}
class Child extends Parent{
        someAction(){
            this.printMessage("sample args");//calling the parent method
        }
}

let child = new Child()
child.someAction();//calling the child method using object