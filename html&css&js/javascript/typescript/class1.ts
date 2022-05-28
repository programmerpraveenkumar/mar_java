import { class2 } from "./class2";
class class1{
        printMessage(){
            let cls2 = new class2();
            console.log("this is class1 ");
            cls2.printMessage();
        }
}

let cls1 = new class1();
cls1.printMessage();