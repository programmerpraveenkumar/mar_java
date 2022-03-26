public class ClassOne {
    public static void main(String[] args) {
        //classname obj = new classname();
        ClassTwo classtwo = new ClassTwo();
        System.out.println(classtwo.age);//access the variable using object
        System.out.println(classtwo.isChild);

        ClassTwo classtwo1 = new ClassTwo();
        classtwo1.age = 45;
        classtwo1.isChild = true;
        System.out.println(classtwo1.age);//access the variable using object
        System.out.println(classtwo1.isChild);
    }
}
