package MethodDeclaration;

public class StaticVariables {
    int price = 454;
    static String name = "test";//static variables

    public static void main(String[] args) {
        System.out.println(name);//no need of object for static variables
        //System.out.println(price);///will throw the error.as it is not static.
    }
}
