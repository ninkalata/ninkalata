package com.demo.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//if flag = login
		
		
		String password = request.getParameter("password");
		String userId = request.getParameter("userId");
		String usertype = request.getParameter("usertype");
		String user = request.getParameter("radio");
		//String update = request.getParameter("Update form");
		if(Repository.validateLogin( userId,  password,  usertype)) {
			if(usertype.equals("maker")) {
				response.sendRedirect("selection.html");
		if(user.equals("Update form")) {
			response.sendRedirect("maker.html");
		}
		else {
			response.sendRedirect("updarefile.html");
		}
		
            }
			else{
				response.sendRedirect("checker.html");
			}
		}
		else {
			response.sendRedirect("error.html");
		}
	}
}

	

