package MethodDeclaration;

public class StaticAndNonStatic {
    static String name = "test";//static var
    int age = 45;//non static variable


    //non static method.
    public void add(int x,int y){
        int res =x+y;
        System.out.println(res);
        message("addition is "+res);//calling static method from non-static.no need to create object.
    }

    //static method
    public static void add(int x,int y,int z){
        int res = x+y+z;
        System.out.println(res);
    }
    public static void message(String msg){
        System.out.println(msg);
//        StaticAndNonStatic obj = new StaticAndNonStatic();//as this line in static method.need to create object.
//        System.out.println(obj.age);//as it is non static.it should be access using objects.
    }

    public static void main(String[] args) {
        System.out.println(StaticAndNonStatic.name);//access static variables
        add(10,10,15);//it is static method.no object.

        StaticAndNonStatic obj = new StaticAndNonStatic();
        System.out.println(obj.age);//as it is non static.it should be access using objects.
        obj.add(10,5);//non static metho.need to access from object.

    }
}
