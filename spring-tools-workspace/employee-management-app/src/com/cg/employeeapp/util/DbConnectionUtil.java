package com.cg.employeeapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtil {

	public static Connection getDbConnection() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/cg_mulesoft_jan";
    	String username = "root";
    	String password = "password";

    	Connection con = DriverManager.getConnection(url, username, password);
		
    	return con;
	}
	
}
