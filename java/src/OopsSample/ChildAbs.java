package OopsSample;

public class ChildAbs extends AbsParent {
    public static void main(String[] args) {
        ChildAbs obj = new ChildAbs();
        obj.add(15,10);//calling parent class method using  child obj
        obj.printName();
        obj.inchild();
        //AbsParent parent = new AbsParent();//cannot create obj for abstract class.
        AbsParent parent = new ChildAbs();//object created usign child class for abstrct  class.
        parent.printName();
        //parent.inchild -> child class method cannot access.


    }

    void inchild(){
        System.out.println("sample message from the child");
    }


    @Override
    public void printName() {
        System.out.println("sample printName from the child");

    }
}
