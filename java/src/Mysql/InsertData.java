package Mysql;

import java.sql.*;

public class InsertData {

    public static void main(String[] args) {
        /*
            username,password,portno,servername,database_name
         */
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/apr_mor", "root", "");
            Statement stmt = conn.createStatement();
            stmt.execute("insert into customer(name,email,mobile,address,city)values('testname12','fromjava1@gmail.com','testmobile','testaddress',1)");
            //System.out.println("connection successfull");
            System.out.println("data inserted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
