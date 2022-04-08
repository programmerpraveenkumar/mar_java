package FILEIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteSample {
    public static void main(String[] args) {
        try{
            //FileOutputStream obj = new FileOutputStream("test.txt");//create file without path..so it will created in the project location itself
            FileOutputStream obj = new FileOutputStream("/Volumes/softwares/upload_folder/test.txt");//created file in location.
            System.out.println("File has created...");
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        } catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }
}
