package com.jdc.mkt.statement;

import java.sql.SQLException;

import com.jdc.mkt.Connector;
import com.jdc.mkt.Person;

public class B_Update_Statement {
	
	public static int[] batchUpdate(Person...persons) {
		
		try (var con = Connector.getConnectionWithSingleString(); 
				var stmt = con.createStatement()) {
			
			stmt.addBatch("drop table if exists person_tbl");
			
			stmt.addBatch("""
					create table person_tbl(
						id int primary key auto_increment,
						name varchar(45) not null,
						age int);
					""");

//			stmt.addBatch("truncate table person_tbl");
			
			for(Person p :persons) {
				stmt.addBatch("insert into person_tbl(name,age)values('%s',%d)".
						formatted(p.name(),p.age()));
			}
			return stmt.executeBatch();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

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
