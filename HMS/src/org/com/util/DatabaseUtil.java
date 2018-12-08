	package org.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil{
	static Connection con;

	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
	    }catch (ClassNotFoundException e){
	    	System.err.println(e.getMessage());
	    }
	}

	public static Connection retrieveConnection() throws SQLException {
		if (con == null){
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management","root","root");
		}
		return con;
	}
}
