public class CastingString {
/*
widecasting
    int->long->float->double

narrow casting
    double->float->long->int
 */
    public static void main(String[] args) {
        String age = "45";//int inside string
        int ageint = Integer.valueOf(age);//string to int
        long agelong = Long.valueOf(age);//string to long
        System.out.println(age+" --> "+ageint+" "+agelong);
    }
}
