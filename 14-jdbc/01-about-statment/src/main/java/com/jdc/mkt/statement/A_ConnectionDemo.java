package com.jdc.mkt.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdc.mkt.Connector;

public class A_ConnectionDemo {

	public static void main(String[] args) {

		String query = "select * from account_tbl";

		try (Connection con = Connector.getConnectionWithProperties(); 
				Statement stmt = con.createStatement();) {

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println("Name :%s\tBalance :%d".
						formatted(rs.getString(1), rs.getInt(2)));
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

	}

}
