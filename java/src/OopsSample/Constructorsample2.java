package OopsSample;
/*
Constructor
	method name same as classname
	will call while creating the object.
	no need to call explicitly
 */
public class Constructorsample2 {
    int num;
    Constructorsample2(int num){
        System.out.println("this is simple constructor");
        this.num = num;//global num will be assigned from parameter num;
    }

    public static void main(String[] args) {
        new Constructorsample2(10);
    }
}
