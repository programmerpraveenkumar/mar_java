package OopsSample;

public class Maths {

    private int num2;
    private int num1;

    Maths(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    void add(){
        System.out.println(this.num1+this.num2);//calling global variables
    }
    void sub(){
        System.out.println(this.num2-this.num1);//calling global variables
    }
    public static void main(String[] args) {
        Maths m = new Maths(10,15);//passing values in the constructor
        m.add();//calling methods using object
        m.sub();//calling methods using object
    }
}
