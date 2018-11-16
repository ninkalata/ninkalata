package com.demo.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Repository {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			// Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Get a connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}

	public static boolean validateLogin(String userId, String password, String type) {
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			// Execute a Query
			String query =  "select count(*) from lata_login_table where user_id='"+ userId + "' and password ='"+ password + "',' and user_type = '"+ type + "'";
			ResultSet resultSet = statement.executeQuery(query);
			resultSet.next();
			//System.out.println(loginResult.getInt(1));
			if (resultSet.getInt(1) == 0) {
				return false;
			} 
			return true;
			
		} catch (Exception exception) {
			System.out.println("Error validating in db : " + exception);
		}
		return false;
	}

}



