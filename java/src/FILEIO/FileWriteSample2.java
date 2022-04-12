package FILEIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteSample2 {
    public static void main(String[] args) {
        FileOutputStream obj = null;
        try{
            String message = "File write example content 123123123123 -1";;
            //FileOutputStream obj = new FileOutputStream("test.txt");//create file without path..so it will created in the project location itself
             obj = new FileOutputStream("test2.txt");//created file in location.
            obj.write(message.getBytes());//string to bytes .
            System.out.println("File has created...");
            obj.close();//close the connection.
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        } catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }finally {
            //finally called either try or catch.
            try{

                if(obj != null){
                    obj.close();//close the connection.
                }

            }catch (Exception e){

            }
        }
    }
}
