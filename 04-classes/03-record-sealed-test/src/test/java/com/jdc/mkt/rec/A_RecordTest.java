package com.jdc.mkt.rec;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class A_RecordTest {

	@Test
	void test() {
		Human human = new Human("Andrew",40,LocalDate.of(2027, 02, 20));
		System.out.println(human.name()+"\t"+human.age()+"\t"+human.dob());
	}
}
