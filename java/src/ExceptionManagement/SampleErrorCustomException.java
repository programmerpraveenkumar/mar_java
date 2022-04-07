package ExceptionManagement;

public class SampleErrorCustomException {

    public static void main(String[] args) {
        int[] count = {10,5,15};
        try{
            int num = 145;

           if(num > 50){
               throw  new CustomExceptionSample("some error");
           }
        }catch (CustomExceptionSample e){
            System.out.println("Error in Exception.."+e.getMessage());
        }

        System.out.println("this is last line");
    }
}
