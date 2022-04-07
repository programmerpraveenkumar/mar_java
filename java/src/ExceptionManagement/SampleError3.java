package ExceptionManagement;

public class SampleError3 {

    public static void main(String[] args) {
        try{
            //whenever method is declared with throws exception.it should be wrapped with try catch.
            isChild(5);//static method.so no need to create object.
            isChild(15);
        }catch (Exception e){
            System.out.println("Error in main method::"+e.getMessage());
        }

        try{
            System.out.println(add(75,75));
            System.out.println(add(5,5));
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }

    //return the error from the method.
    public  static void isChild(int age)throws Exception{
            if(age <=10){
                System.out.println("This is child");
            }else{
                throw new Exception("Error:This is NOt child");//return the error from this method.
            }
    }

    //return type of method is int or Exception.
    public static int add(int num,int num2)throws Exception{
        int res = num+num2;
        if(res > 100){
            return res;
        }else{
            throw new Exception("adding numbers shouhld be more than 100");//throwing the error
        }
    }
}
