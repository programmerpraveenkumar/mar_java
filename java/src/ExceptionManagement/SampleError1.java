package ExceptionManagement;

public class SampleError1 {

    public static void main(String[] args) {
        int[] count = {10,5,15};
        System.out.println(count[0]);
        int num = 45;
        System.out.println(num/0);//ArithmeticException exception
        System.out.println(count[5]);//will throw the error
        try{


        }catch (ArithmeticException e){
            System.out.println("Error in ArithmeticException .."+e.getMessage());
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Error in array iteration.."+e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error in Excpetion.."+e.getMessage());
        }

        System.out.println("this is last line");
    }
}
