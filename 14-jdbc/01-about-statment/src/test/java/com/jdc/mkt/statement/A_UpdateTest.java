package com.jdc.mkt.statement;

import static com.jdc.mkt.statement.B_Update_Statement.deletePerson;
import static com.jdc.mkt.statement.B_Update_Statement.insertPerson;
import static com.jdc.mkt.statement.B_Update_Statement.updatePerson;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.JunitFactory;

public class A_UpdateTest extends JunitFactory{
	
	@Test
	@Order(1)
	void insertTest() {
		int result = insertPerson("James", 25);
		assertEquals(1, result);
	}
	
	@Test
	@Order(2)
	void updateTest() {
		int result = updatePerson(1,"Mr.Andrew", 25);
		assertEquals(1, result);
	}
	
	@Test
	@Order(3)
	void deleteTest() {
		int result = deletePerson(1);
		assertEquals(1, result);
	}
}
