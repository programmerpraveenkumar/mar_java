package OopsSample;
/*

abstract class
    1.A class which is declared with abstract keyword,is considered as abstract class.
    2.for Abstract class object cannot be created.
    3.so abstract classes can be used only in inheritance.
    4.if any methods declare as abstract,tht method has to be override in the child class.
    5.Abstract method should not have definition in the abstract class or parent class.
 */
public abstract class AbsParent {
    public void add(int num,int num2){
        System.out.println(num+num2);
    }
    public void sub(int num,int num2){
        System.out.println(num2-num);
    }
    //below abstract method should be override inthe child class.
  public abstract void printName();//only declaration can be allowed.
}
