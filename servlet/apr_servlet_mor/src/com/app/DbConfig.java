package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConfig {
	
	public void getData() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");//explicitly load  Mysql driver to this project
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
	
	
	  public static void register(String name,String email,String password) {
	        /*
	            username,password,portno,servername,database_name
	         */
	        try{
	        	Class.forName("com.mysql.cj.jdbc.Driver");//explicitly load  Mysql driver to this project
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/apr_mor", "root", "");
	            Statement stmt = conn.createStatement();
	            stmt.execute("insert into customer(name,email,password)values('"+name+"','"+email+"','"+password+"')");
	            //System.out.println("connection successfull");
	            System.out.println("data register successfully");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	    }
}
