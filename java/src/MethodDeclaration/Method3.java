package MethodDeclaration;
/*
public return_type|void name_of_method(){

}
 */
public class Method3 {


    //method with int return type.method declared with arguments.
    public int addition(int x,int y,String msg){
        int res = x+y;
        System.out.println(msg+res);
        return res;
    }

    //main function to execute the java class
    public static void main(String[] args) {
        //create the object for this clas in the main function
        Method3 m = new Method3();
        m.addition(20,5,"addition is ");//access the method using objects
        m.addition(10,5,"Answer for the addition is ");//access the method using objects
    }
}
