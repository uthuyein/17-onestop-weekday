package com.jdc.mkt.preparedStatement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.Connector;
import com.jdc.mkt.Person;

public class D_StoreProcedure {

	private static String procedure = """
			delimiter ||
			create procedure getAllPersonBy(IN names varchar(45))
			begin
				select * from person_tbl where lower(name) like lower(names);
			end ||
			delimiter ;
			""";

	public static void createProcedure() {
		try (var con = Connector.getConnectionWithProperties(); 
			var stmt = con.createStatement()) {

			stmt.execute(procedure);

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	public static List<Person> getNames(String name) {
		
		var list = new ArrayList<Person>();
		
		try (var con = Connector.getConnectionWithProperties();
			var stmt = con.prepareCall("{call getAllPersonBy(?)}")) {
			
			stmt.setString("names", name.concat("%"));
			
			var rs = stmt.executeQuery();
			
			while(rs.next()) {
				list.add(new Person(
						rs.getInt("id"),
						rs.getString("name"), 
						rs.getInt("age")));
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return list;
	}
}
