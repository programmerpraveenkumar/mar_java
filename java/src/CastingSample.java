public class CastingSample {
/*
widecasting
    int->long->float->double

narrow casting
    double->float->long->int
 */
    public static void main(String[] args) {
        int num = 45;
        float float_num = num;//assign the int to the float.
        System.out.println(float_num);
        //narrow casting..
        double share_price = 45.2525;
        int price = (int)share_price;//bigger to smaller
        System.out.println(share_price+" ---> "+price);
    }
}
