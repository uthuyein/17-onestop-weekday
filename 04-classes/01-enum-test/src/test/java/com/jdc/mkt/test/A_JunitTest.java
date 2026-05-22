package com.jdc.mkt.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class A_JunitTest {

	@BeforeAll
	static void methodOne() {
		System.out.println("Method One Before All Start");
	}
	@AfterAll
	static void methodTwo() {
		System.out.println("Method Two After All Start");
	}
	@BeforeEach
	void methodThree() {
		System.out.println("Method Three Before Each Start");
	}
	@AfterEach
	void methodFour() {
		System.out.println("Method Four After Each Start");
	}
	@Test
	void methodFive() {
		System.out.println("Method Five Test Start");
	}
	@Test
	void methodSix() {
		System.out.println("Method Six Test Start");
	}
}
