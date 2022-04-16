package Mysql;

import java.sql.*;

public class selectData {

    public static void main(String[] args) {
        /*
            username,password,portno,servername,database_name
         */
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/apr_mor", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select name,email from customer");
            //till it reaches the last data.
            while(rs.next()){
                System.out.println(rs.getString("name")+" "+rs.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
