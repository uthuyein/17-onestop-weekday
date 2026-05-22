package com.jdc.mkt.reflect;

import org.junit.jupiter.api.Test;

public class StudentTest {

	@Test
	void test() {
		Student st = new Student();
		System.out.println(st.getName());
		System.out.println(st.getAge());
	}
}
