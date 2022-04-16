public class FinalKeywordSample {
    final String name ="test";///final variable
    /*
        final variable->
            final variable value cannot be changed once it is assigned
            final variable should be assigned while creating
            so this can be useful for creating the constants.

        final class
            cannot be used in inheritance as a parent class.

         final method
                cannot be override in the child class.

     */
    public static void main(String[] args) {
        FinalKeywordSample obj = new FinalKeywordSample();
        //obj.name ="test";//error..final variable cannbe re-assign.
        System.out.println(obj.name);
    }
}
