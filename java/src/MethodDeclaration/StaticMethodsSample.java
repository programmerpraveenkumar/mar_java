package MethodDeclaration;
/*
cannot (create or access) object for static method or static variables
using classname can access from the other classes.
to share the common values across the application.
 */
public class StaticMethodsSample {
    static String name = "sample name";
    public static void add(int x,int y){
        int res = x+y;
        System.out.println(res);
    }
    public static void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        add(10,15);//for static method.no need to create objects
        add(15,56);
    }
}
