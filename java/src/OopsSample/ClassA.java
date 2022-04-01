package OopsSample;
/*
inheritance can be done using extends keyword
overloading and overriding.
 */
public class ClassA extends ClassB {

    @Override//override the parent class method in the child
    public void printMessage(){
        System.out.println("override::this is in the child class");
    }

    public void printname(){
        System.out.println("this is in the child class");
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();//object for classA
        System.out.println(obj.name);//using child object,can acces the parent class vairables
        obj.name  = "update value in the child for the parent";
        System.out.println(obj.name);//using child object,can acces the parent class vairables
        obj.printMessage();//calling parent class method using child obj
        obj.printname();//calling child class method using child obj


        //OBject creation for classB
        ClassB obj2 = new ClassB();
        obj2.printMessage();//calling the method
        System.out.println(obj2.name);
    }
}
