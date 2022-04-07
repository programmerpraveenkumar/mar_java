package ExceptionManagement;


/*
custom exception should inherit the Exception.
it should call the parent class constructor.
 */
public class CustomExceptionSample extends Exception{
    public CustomExceptionSample(String message){
        //send the error to the client or SM or common email
        super(message);//it will call parent class constructor with string args.
    }
}
