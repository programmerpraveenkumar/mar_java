class Calc{
    add(){
        this.getResult("add");
    }  
    sub(){
        this.getResult("sub");
    }
    getResult(action){
        let num1 = parseInt(document.getElementById("num1").value);
        let num2 = parseInt(document.getElementById("num2").value);
        let res = 0;
        if(action == "add"){
            res = num1+num2;
            console.log("addition value is "+res);
            document.getElementById("result").innerHTML = res;
        }
        else if(action == "sub"){
            res = num1-num2;
            console.log("subtraction value is "+res);
            document.getElementById("result").innerHTML = res;
        }else{
            console.log("No action found..")
        }                    
    }

}
calc = new Calc();