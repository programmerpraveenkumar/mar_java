package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateData {

    public static void main(String[] args) {

        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/apr_mor", "root", "");
            Statement stmt = conn.createStatement();
           // stmt.execute("update customer set name='testname',email='updateemail@gmailcom' where customer_no = 7");
            //System.out.println("connection successfull");
            System.out.println("data updated successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
/*
 public static void main(String[] args) {

        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/apr_mor", "root", "");
            Statement stmt = conn.createStatement();

            System.out.println("ok..");
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
 */