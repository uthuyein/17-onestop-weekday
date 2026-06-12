package com.jdc.mkt.statement;

import static com.jdc.mkt.statement.B_Update_Statement.batchUpdate;
import static com.jdc.mkt.statement.B_Update_Statement.deletePerson;
import static com.jdc.mkt.statement.B_Update_Statement.insertPerson;
import static com.jdc.mkt.statement.B_Update_Statement.updatePerson;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.mkt.Person;

@TestMethodOrder(OrderAnnotation.class)
public class A_UpdateTest {

	@Test
	@Order(1)
	void batchTest() {
		int[] array = batchUpdate(
				new Person("Andrew",20),
				new Person("William",40),
				new Person("John",31));
		
		for(int a : array) {
			System.out.println("Result ::"+a);
		}
	}
	@Test
	@Order(2)
	void insertTest() {
		int result = insertPerson("James", 25);
		assertEquals(1, result);
	}
	
	@Test
	@Order(3)
	void updateTest() {
		int result = updatePerson(1,"Mr.Andrew", 25);
		assertEquals(1, result);
	}
	
	@Test
	@Order(4)
	void deleteTest() {
		int result = deletePerson(1);
		assertEquals(1, result);
	}
}
