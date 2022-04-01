package ExceptionManagement;

public class SampleError2 {

    public static void main(String[] args) {
        isChild(5);//static method.so no need to create object.
        isChild(15);
    }
    public  static void isChild(int age){
        try{
            if(age <=10){
                System.out.println("This is child");
            }else{
                throw new Exception("Error:This is NOt child");//Creation of Custom error Message
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
