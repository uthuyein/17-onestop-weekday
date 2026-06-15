package com.jdc.mkt.preparedStatement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.Connector;
import com.jdc.mkt.Person;

public class B_SelectStatement {

	public static List<Person> selectBy(Integer id,String name, Integer age){
		List<Person> list = new ArrayList<>();
		List<Object> temp = new ArrayList<>();
		
		var sb = new StringBuilder("select * from person_tbl where 1=1");
		
		if(null != id && id > 0) {
			sb.append(" and id = ?");
			temp.add(id);
		}
		
		if(null != name) {
			sb.append(" and lower(name) like lower(?)");
			temp.add(name.concat("%"));
		}
		
		if(null != age && age > 0) {
			sb.append(" and age >= ?");
			temp.add(age);
		}
				
		try(var con = Connector.getConnectionWithTripleString();
			var stmt = con.prepareStatement(sb.toString())){
			
			for(int i = 0 ; i < temp.size() ; i ++) {
				stmt.setObject(i+1, temp.get(i));
			}
			
			var rs = stmt.executeQuery();
			while(rs.next()) {
				list.add(new Person(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getInt("age")
						));
			}

		}catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return list;
	}
}


