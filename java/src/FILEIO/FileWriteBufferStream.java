package FILEIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteBufferStream {
    public static void main(String[] args) {
        FileOutputStream obj = null;
        BufferedOutputStream bout = null;
        try{
            String message = "File write example content";;
            //FileOutputStream obj = new FileOutputStream("test.txt");//create file without path..so it will created in the project location itself
             obj = new FileOutputStream("test2.txt");//created file in location.

             bout = new BufferedOutputStream(obj);
            bout.write(message.getBytes());//write the data to buffer stream.oly in the buffer
            bout.write(message.getBytes());//write the data to buffer stream.
            bout.write(message.getBytes());//write the data to buffer stream.
            bout.flush();//write the data to file.
            bout.close();//close the connection of buffer stream.


            System.out.println("File has created...");
            obj.close();//close the connection.
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        } catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }finally {
            //finally called either try or catch.
            try{
                if(bout != null){
                    bout.close();
                }
                if(obj != null){
                    obj.close();//close the connection.
                }
            }catch (Exception e){

            }
        }
    }
}
