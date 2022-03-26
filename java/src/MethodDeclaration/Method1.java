package MethodDeclaration;
/*
public return_type|void name_of_method(){

}
 */
public class Method1 {

    //method without returntype.so it declared as void.
    public void printSomething(){
        System.out.println("this is very simple message");
        //no return type
    }

    //method with int return type.
    public int addition(){
        int res = 10+5;
        return res;//return statement should be the last line
        //System.out.println("");//error after return statement
    }

    //method with boolean return type.
    public boolean getBoolean(){
        return true;//return the boolean..it should be last statement.
    }


    //main function to execute the java class
    public static void main(String[] args) {
        //create the object for this clas in the main function
        Method1 m = new Method1();
        m.printSomething();//access the method using objects
        System.out.println(m.addition());//access the method using objects
        System.out.println(m.getBoolean());//access the method using objects
    }
}
