package FILEIO;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
/*
read the content from the multiple location.
 */
public class SequenceInputStreamsample {
    public static void main(String[] args) {
        try{
            FileInputStream f1 = new FileInputStream("test.txt");
            FileInputStream f2 = new FileInputStream("test2.txt");
            SequenceInputStream obj = new SequenceInputStream(f1,f2);//reading from the two files
            int read;
            while((read = obj.read()) != -1){
                System.out.print((char)read);
            }
        }catch (Exception e){

        }

    }
}
