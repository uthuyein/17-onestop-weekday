package com.jdc.mkt;

import static com.jdc.mkt.statement.B_Update_Statement.batchUpdate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class JunitFactory {

	@BeforeAll
	protected static void init() {
		batchTest();
	}
	
	private static void batchTest() {
		int[] array = batchUpdate(
				new Person("Andrew",20),
				new Person("William",40),
				new Person("John",31));
		
	}
}
