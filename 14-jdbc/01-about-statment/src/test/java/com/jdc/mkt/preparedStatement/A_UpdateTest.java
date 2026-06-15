package com.jdc.mkt.preparedStatement;

import static com.jdc.mkt.preparedStatement.A_UpdateStatemet.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.JunitFactory;
import com.jdc.mkt.Person;

public class A_UpdateTest extends JunitFactory{

	@Order(1)
	@ParameterizedTest
	@CsvSource(value = {
			"Patrick:61:1",
			"Michael Bannett:70:1"
	},delimiter = ':')
	void insertTest(String name ,int age,int row) {
		var res = insert(new Person(name,age));
		assertEquals(row, res);
	}
	
	@Order(2)
	@ParameterizedTest
	@CsvSource(value = {
			"4:Patrick Naugthon:61:1",
			"5:Michael Bannett:75:1"
	},delimiter = ':')
	void updateTest(int id,String name ,int age,int row) {
		var res = update(new Person(id,name,age));
		assertEquals(row, res);
	}
	
	@Order(3)
	@ParameterizedTest
	@CsvSource(value = {
			"4:1",
			"5:1"
	}
	,delimiter = ':')
	void deleteTest(int id,int row) {
		var res = delete(id);
		assertEquals(row, res);
	}
	
	
	
}
