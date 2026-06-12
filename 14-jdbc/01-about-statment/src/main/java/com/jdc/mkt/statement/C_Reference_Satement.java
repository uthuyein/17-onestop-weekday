package com.jdc.mkt.statement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.Connector;
import com.jdc.mkt.Person;

public class C_Reference_Satement {

	
	public static List<Person> selectBy(Integer id,String name, Integer age) {

		StringBuilder sb = new StringBuilder("select * from person_tbl where 1=1");
		List<Person> persons = new ArrayList<Person>();
	
		try (var con = Connector.getConnectionWithProperties();
				var stmt = con.createStatement()) {

			if (null != name) {
				sb.append(" and lower(name) like lower('%s')"
						.formatted(name.concat("%")));
			}
			if (null != age && age > 0) {
				sb.append(" and age >= %d".formatted(age));
			}
			if (null != id && id > 0) {
				sb.append(" and id = %d".formatted(id));
			}
			System.out.println(sb.toString());
			var rs = stmt.executeQuery(sb.toString());
			
			while(rs.next()) {
				Person p = new Person(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getInt("age"));
				
				persons.add(p);
			}
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return persons;
	}

}
