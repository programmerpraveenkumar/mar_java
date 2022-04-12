package FILEIO;

import java.io.File;
import java.io.IOException;

public class DirCreateSample {
    public static void main(String[] args) {
        try{
            //FileOutputStream obj = new FileOutputStream("test.txt");//create file without path..so it will created in the project location itself
          File file = new File("/Volumes/softwares/upload_folder/apr-12/tes/test");//created file in location.
            file.mkdir();//create a dir
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }
}
