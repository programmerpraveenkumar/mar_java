package FILEIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
-1 is the last character of the file in java.
 */
public class BufferStreamReadFileSample {

    public static void main(String[] args)  {
        FileInputStream input = null;
        BufferedInputStream bufRead = null;
        try{
            input = new FileInputStream("test2.txt");
             bufRead = new BufferedInputStream(input);
            int read;
            while((read = bufRead.read()) != -1){
                System.out.print((char)read);
            }
           /// System.out.println("file read has completed...");

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
                if(bufRead != null){
                    bufRead.close();
                }
                if(input != null){
                    input.close();//close the connection.
                }
            }catch (IOException e){

            } catch (Exception e){

            }

        }
    }
}
