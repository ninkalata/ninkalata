package com.demo.training;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.internal.dynalink.beans.StaticClass;

public class Repository {

	static  Connection connection=null;
	{
		try {
			// Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Get a connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}


	public static boolean validateLogin(String userId, String password, String usertype) {
		boolean status=false;
		try {
			
//			Statement statement = connection.createStatement();
//			// Execute a Query
//			String query = "select count(*) from lata_login where user_id='" + userId + "' and password ='"
//					+ password + "' and user_type = '" + usertype + "'";
//
//			System.out.println(query);
//			ResultSet loginResult = statement.executeQuery(query);
//			// Iterate through the result set and display the records.
//			while(loginResult.next())
//			{
//			System.out.println("Valid Login!");
//			System.out.println(loginResult.getInt(1));
//			if (loginResult.next()) {
//				if (loginResult.getInt(1) > 0)
//					return true;
			PreparedStatement preparedstatement=connection.prepareStatement(  
					"select * from lata_login where user_id=? and password=? and user_type =?");
			preparedstatement.setString(1,userId);  
			preparedstatement.setString(2,password);  
					      
					ResultSet rs=preparedstatement.executeQuery();  
			status=rs.next();
					          
					}catch(Exception e){System.out.println(e);}  
					return status;  
					}  
				
			}
			
//		} catch (Exception exception) {
//			System.out.println("Error validating in db : " + exception);
//		}
//		return false;
//
//	}
//
//}
