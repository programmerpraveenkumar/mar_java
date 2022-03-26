package MethodDeclaration;

public class SampleMain {
    public static void main(String[] args) {
        StaticMethodsSample.add(10,5);//static methods accessible using classname
        StaticMethodsSample.printName();
        StaticMethodsSample.name = "update values";
        StaticMethodsSample.printName();

    }
}

/*
how jdk will execute main class.?
SampleMain.main()
 */
