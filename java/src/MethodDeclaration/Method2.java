package MethodDeclaration;
/*
public return_type|void name_of_method(){

}
 */
public class Method2 {
        public String name = "sample name";
        private int age = 45;

    //method with int return type.method declared with arguments.
    private int addition(int x,int y){
//        int x = 5;
//        int y = 10;
        int res = x+y;
        System.out.println(res);
        return res;//return statement should be the last line
        //System.out.println("");//error after return statement
    }
    public float addition(float a,float b){
        float ans = a+b;
        System.out.println("float answer is "+ans);
        return ans;
    }

    //method overloading->same method with different params.
    public float addition(float a,float b,float c){
        float ans = a+b;
        System.out.println("float answer is "+ans);
        return ans;
    }

    //method overloading->same method with different params.
    private int addition(int x,int y,int z){
        int ans = x+y;
        int res = x+y+z;
        System.out.println(res);
        return res;//return statement should be the last line
        //System.out.println("");//error after return statement
    }

    private void printMessage(String msg){
        System.out.println("message is "+msg);
    }
    public boolean checkChildAge(int age){
            boolean isChild;//declare the variable
            if(age <10){
                isChild = true;
            }else{
                isChild = false;
            }
            printMessage("is this child...?"+isChild);
            return isChild;
    }

    //main function to execute the java class
    public static void main(String[] args) {
        //create the object for this clas in the main function
        Method2 m = new Method2();
        m.addition(20,5);//access the method using objects
        m.addition(10,5);//access the method using objects
        m.addition(25,5);//access the method using objects
        m.addition(9,4);//access the method using objects
        m.addition(9.5f,4.0f);//access the method using objects
        m.addition(9,4,10);//access the method using objects
        //m.addition(9,4,10,45);//error.method arguments does not match with methods.
        m.checkChildAge(15);
        m.checkChildAge(10);
        m.checkChildAge(9);
        m.checkChildAge(5);

    }
}
