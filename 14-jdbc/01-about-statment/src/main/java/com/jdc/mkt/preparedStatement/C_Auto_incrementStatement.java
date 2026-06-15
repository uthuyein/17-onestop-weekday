package com.jdc.mkt.preparedStatement;

import java.sql.Statement;

import com.jdc.mkt.Connector;
import com.jdc.mkt.Person;

public class C_Auto_incrementStatement {

	public static int insert(Person p) {
		String sql = "insert into person_tbl(name,age) values (?,?)";
		try(var con = Connector.getConnectionWithProperties();
			var stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			
			stmt.setString(1, p.name());
			stmt.setInt(2, p.age());
			
			stmt.executeUpdate();
			
			var rs = stmt.getGeneratedKeys();
			
			while(rs.next()) {
				return rs.getInt(1);
			}
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return  0;
	}
}
