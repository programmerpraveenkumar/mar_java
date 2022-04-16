package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

    public static void main(String[] args) {
        /*
            username,password,portno,servername,database_name
         */
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/apr_mor", "root", "");
            Statement stmt = conn.createStatement();
            stmt.execute("delete from customer where customer_no=5");
            //System.out.println("connection successfull");
            System.out.println("data deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
