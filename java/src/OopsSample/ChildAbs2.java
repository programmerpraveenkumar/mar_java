package OopsSample;

public class ChildAbs2 extends AbsParent {
    public static void main(String[] args) {
        ChildAbs2 obj = new ChildAbs2();
        obj.add(32,10);//calling parent class method using  child obj
        obj.printName();
        //AbsParent parent = new AbsParent();//cannot create obj for abstract class.
    }


    @Override
    public void printName() {

    }
}
