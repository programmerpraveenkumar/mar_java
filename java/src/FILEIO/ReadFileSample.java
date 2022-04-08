package FILEIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
-1 is the last character of the file in java.
 */
public class ReadFileSample {

    public static void main(String[] args)  {
        File file = null ;
        FileInputStream input = null;


        try{
            file = new File("test2.txt");
            System.out.println("read..?"+file.canRead());
            System.out.println("write..?"+file.canWrite());
            if(file.exists()){
                input = new FileInputStream(file);

                //System.out.println((char)input.read());//read the data and convert bytes to string.
                int read;
                while((read = input.read()) != -1){
                    System.out.print((char)read);
                }
                /// System.out.println("file read has completed...");
            }else{
                System.out.println("file is not exist..");
            }


        }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException Exception "+e.getMessage());
        }catch (IOException e){
            System.out.println("IO Exception "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }finally {
            //finally called either try or catch.
            try{

                input.close();//close the connection.
            }catch (IOException e){

            } catch (Exception e){

            }

        }
    }
}
