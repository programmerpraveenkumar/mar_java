package OopsSample;
/*
Constructor
	method name same as classname
	will call while creating the object.
	no need to call explicitly
 */
public class Constructorsample {
    Constructorsample(){
        System.out.println("this is simple constructor");
    }

    public static void main(String[] args) {
        new Constructorsample();
    }
}
