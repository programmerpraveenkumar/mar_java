package FILEIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
    pojo class should implement the interface `Serializable`
    static member(variables or methods) cannot be written to the file.
 */
public class SerilizationSample {
    /*
        writing the obj to the file.
     */

    public static void main(String[] args) {

        try{
            //created object
            SampleFilePojo filePojo = new SampleFilePojo();
            filePojo.setId(1);
            filePojo.setName("testname");
            FileOutputStream fout = new FileOutputStream("obj.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fout);
            objOut.writeObject(filePojo);//write object to the file.
        }catch (Exception e){
                    e.printStackTrace();//if any error
        }
    }

}
