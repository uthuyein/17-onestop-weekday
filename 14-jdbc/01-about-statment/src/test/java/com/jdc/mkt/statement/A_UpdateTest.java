package com.jdc.mkt.statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static com.jdc.mkt.statement.B_Update_Statement.*;

@TestMethodOrder(OrderAnnotation.class)
public class A_UpdateTest {

	@Test
	@Order(1)
	void insertTest() {
		int result = insertPerson("Andrew", 20);
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
