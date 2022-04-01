package OopsSample;
/*
 1.A class which is declared with interface keyword,is considered as interface.
    2.for interface object cannot be created.
    3.so interface can be used only in inheritance.using keyword called implements.
    4.interface should not have any method definition.So only method declaration can be allowed.
    5.So all methods have to be declared in the child class.
    6.multiple interface can be allowed in child class
 */
public interface ParentInterface {
    public void message();
    public void add(int num,int num2);
}
