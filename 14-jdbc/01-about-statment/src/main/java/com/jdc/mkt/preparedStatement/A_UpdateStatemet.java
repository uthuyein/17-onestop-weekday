package com.jdc.mkt.preparedStatement;

import com.jdc.mkt.Connector;
import com.jdc.mkt.Person;

public class A_UpdateStatemet {

	public static int insert(Person p) {
		String query = "insert into person_tbl(age,name)values(?,?)";
		try(var con = Connector.getConnectionWithSingleString();
		    var stmt = con.prepareStatement(query)){
			
			stmt.setInt(1, p.age());
			stmt.setString(2, p.name());
			
			return stmt.executeUpdate();
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return 0;
	}
	
	public static int update(Person p) {
		String query = "update person_tbl set name = ? ,age = ? where id = ?";
		try(var con = Connector.getConnectionWithSingleString();
		    var stmt = con.prepareStatement(query)){
			
			stmt.setString(1, p.name());
			stmt.setInt(2, p.age());
			stmt.setInt(3, p.id());
			
			return stmt.executeUpdate();
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return 0;
	}
	public static int delete(int id) {
		String query = "delete from person_tbl where id = ?";
		try(var con = Connector.getConnectionWithSingleString();
		    var stmt = con.prepareStatement(query)){
			
			stmt.setInt(1, id);
			
			return stmt.executeUpdate();
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return 0;
	}
	
}
