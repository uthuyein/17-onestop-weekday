package com.jdc.mkt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connector {

	private static final String URL = "jdbc:mysql://localhost:3306/testDb";
	private static final String USER = "root";
	private static final String PASS = "admin";

	public static Connection getConnectionWithSingleString() throws SQLException {
		// jdbc:mysql://localhost:3306/testDb?user=root&password=admin
		return DriverManager.getConnection(URL + "?user=" + USER + "&password=" + PASS);
	}

	public static Connection getConnectionWithTripleString() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASS);
	}

	public static Connection getConnectionWithProperties() throws SQLException{
		Properties p = new Properties();
		p.put("user", USER);
		p.put("password", PASS);
		
		return DriverManager.getConnection(URL, p);
	}
}
