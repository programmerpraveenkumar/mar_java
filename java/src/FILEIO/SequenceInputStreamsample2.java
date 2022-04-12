package FILEIO;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamsample2 {
    public static void main(String[] args) {
        try{
            FileInputStream f1 = new FileInputStream("test.txt");
            FileInputStream f2 = new FileInputStream("test2.txt");
            FileInputStream f3 = new FileInputStream("test3.txt");
            FileInputStream f4 = new FileInputStream("test4.txt");
            Vector<FileInputStream> vectorList = new Vector<FileInputStream>();//thread safe
            vectorList.add(f1);//added to the fileInputstream
            vectorList.add(f2);
            vectorList.add(f3);
            vectorList.add(f4);
            //Enumeration<FileInputStream> enList = vectorList.elements()

            SequenceInputStream obj = new SequenceInputStream(vectorList.elements());//reading from the two files
            int read;
            while((read = obj.read()) != -1){
                System.out.print((char)read);
            }
        }catch (Exception e){

        }

    }
}
