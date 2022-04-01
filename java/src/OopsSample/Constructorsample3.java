package OopsSample;
/*
    overloading->same method with diff args
    Constructor overloading

 */
public class Constructorsample3 {
    int num;
    Constructorsample3(){
        System.out.println("this is empty constructor");
    }
    Constructorsample3(int num){
        System.out.println("this is simple constructor "+num);
        this.num = num;//global num will be assigned from parameter num;
    }
    Constructorsample3(String name){
        System.out.println("this is simple constructor with str arg "+name);
        this.num = num;//global num will be assigned from parameter num;
    }

    public static void main(String[] args) {
        new Constructorsample();//will call empty  Constructor
        new Constructorsample3(10);//will call   Constructor with int args
        new Constructorsample3("test");
    }
}
