package com.jdc.mkt.statement;

import java.sql.SQLException;

import com.jdc.mkt.Connector;

public class B_Update_Statement {

	public static int insertPerson(String name, int age) {
		String query = """
					insert into person_tbl(name,age)values('%s',%d)
				""".formatted(name, age);

		return execute(query);
	}

	public static int updatePerson(int id, String name, int age) {
		String query = """
					update person_tbl set name = '%s',age = %d where id = %d
				""".formatted(name, age, id);

		return execute(query);
	}

	public static int deletePerson(int id) {
		String query = """
					delete from person_tbl where id = %d
				""".formatted(id);
		
		return execute(query);
	}

	private static int execute(String query) {
		try (var con = Connector.getConnectionWithSingleString(); 
				var stmt = con.createStatement()) {

			return stmt.executeUpdate(query);

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return 0;
	}

}
