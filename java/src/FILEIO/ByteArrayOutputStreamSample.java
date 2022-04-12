package FILEIO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
write the  same content to the multiple location.
 */
public class ByteArrayOutputStreamSample {
    public static void main(String[] args) {
        try{
            FileOutputStream f1 = new FileOutputStream("test-12-1.txt");
            FileOutputStream f2 = new FileOutputStream("test-12-2.txt");
            FileOutputStream f3 = new FileOutputStream("test-12-3.txt");
            FileOutputStream f4 = new FileOutputStream("test-12-4.txt");
            String message = "content to write";
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bos.write(message.getBytes());
            //write the same message to the multiple location.
            bos.writeTo(f1);
            bos.writeTo(f2);
            bos.writeTo(f3);
            bos.writeTo(f4);

        } catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }
}
