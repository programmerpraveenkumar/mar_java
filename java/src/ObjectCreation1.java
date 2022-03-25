public class ObjectCreation1 {
    int price  = 45;
    double product_price  = 44540.225252;
    String name = "sample";
    public static void main(String[] args) {
        ObjectCreation1 obj = new ObjectCreation1();
        System.out.println(obj.price);//using object can access the variable.
        System.out.println(obj.name);//using object can access the variable.
        System.out.println(obj.product_price);

        //creating object for one more class.
        PersonSample p1 = new PersonSample();
        System.out.println(p1.age);
        System.out.println(p1.contact_number);
        System.out.println(p1.name);
    }
}
