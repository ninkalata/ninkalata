package com.demo.training;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/login")
public class login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//if flag = login
		
		if(Repository.validateLogin("maker","pass","maker")) {
			response.getWriter().println("Valid");
		}
		else {
			response.getWriter().println("Invalid");
		}
	}
	//flag = upload

}