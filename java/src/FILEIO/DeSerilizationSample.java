package FILEIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*

 */
public class DeSerilizationSample {
    /*
        writing the obj to the file.
     */

    public static void main(String[] args) {

        try{

            FileInputStream fin = new FileInputStream("obj.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            SampleFilePojo filePojo = (SampleFilePojo) oin.readObject();//reading the object.
            System.out.println("from the file "+filePojo.getId()+" "+filePojo.getName());

        }catch (Exception e){
                    e.printStackTrace();//if any error
        }
    }

}
