package FILEIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreateSample {
    public static void main(String[] args) {
        try{
            //FileOutputStream obj = new FileOutputStream("test.txt");//create file without path..so it will created in the project location itself
          File file = new File("/Volumes/softwares/upload_folder/test.txt");//created file in location.
            file.createNewFile();//createa a empty file.
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        } catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }
}
