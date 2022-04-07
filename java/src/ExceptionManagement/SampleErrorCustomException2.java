package ExceptionManagement;

public class SampleErrorCustomException2 {

    public static void main(String[] args) {
        int[] count = {10,5,15};
        try{
            int num = 145;

           if(num > 100){
               throw  new CustomExceptionSample("Number shld be greater than 100");
           }
            if(num > 50){
                throw  new CustomExceptionSample("Number shld be greater than 50");
            }
        }catch (CustomExceptionSample e){
            System.out.println("Error in Exception.."+e.getMessage());
        }

        System.out.println("this is last line");
    }
}
