package ExceptionManagement;

public class SampleError1 {

    public static void main(String[] args) {
        int[] count = {10,5,15};
        System.out.println(count[0]);
        try{
            System.out.println(count[5]);//will throw the error
        }catch (Exception e){
            System.out.println("Error in array iteration.."+e.getMessage());
        }

        System.out.println("this is last line");
    }
}
