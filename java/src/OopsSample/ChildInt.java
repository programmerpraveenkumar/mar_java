package OopsSample;
/*
multiple inheritance can be allowed in the child class for interface.
 */
public class ChildInt implements ParentInterface,ParentInterface2 {
    public static void main(String[] args) {
        ChildInt obj = new ChildInt();
        obj.message();
        obj.add(10,15);
        //ParentInterface2 ob = new ParentInterface2();//obj cannot be created.
        ParentInterface2 ob = new ChildInt();//interface object can be created using child class.
        ob.printMessage();//ony method of ParentInterface2 can be access.
    }

    @Override
    public void message() {
        System.out.println("method definition for the interface method.");
    }

    @Override
    public void add(int num, int num2) {
        System.out.println("adding numbers");
        System.out.println(num+num2);
    }

    @Override
    public void printMessage() {
        System.out.println("printMessage2 numbers");
    }
}
