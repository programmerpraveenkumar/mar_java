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
@WebServlet("/Login")
public class Login extends HttpServlet {
 	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");//from the client request
		String password = request.getParameter("password");//from the client request
		System.out.println(email+" "+password);
		if(email.equals("admin@gmail.com") && password.equals("admin")) {
			response.getWriter().append("You are correct");
		}else {
			response.getWriter().append("You are Wrong!!!!");	
		}
		
	}

}
