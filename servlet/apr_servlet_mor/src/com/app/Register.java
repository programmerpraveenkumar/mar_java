package com.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
 	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");//from the client request
		String name = request.getParameter("name");//from the client request
		String password = request.getParameter("password");//from the client request
		System.out.println(email+" "+password+" "+name);
		DbConfig db = new DbConfig();
		db.register(name, email,name);//send the data to database.
		response.getWriter().append("this is post response");		
	}

}
