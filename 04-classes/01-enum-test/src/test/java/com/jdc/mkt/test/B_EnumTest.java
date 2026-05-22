package com.jdc.mkt.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.A_EnumNumber;

public class B_EnumTest {
	
	@Test
	void constructorTest() {
		A_EnumNumber num = A_EnumNumber.THREE;
		System.out.println(num.getNum());
	}
	
	@Test
	@Disabled
	void abstractMethodTest() {
		A_EnumNumber num = A_EnumNumber.TWO;
		System.out.println(num.getFullName());
	}

	@Test
	@Disabled
	void defaultMethodTest() {
//		Get enum value
		A_EnumNumber num = A_EnumNumber.ONE;
		A_EnumNumber num1 = A_EnumNumber.valueOf("ONE");
		
		
		System.out.println("Constant name ::: "+num+" ::: "+num1);	
		System.out.println("String name :::"+num.name());
		System.out.println("Ordinal value :::"+num.ordinal());
		System.out.println("Enum values ::: "+A_EnumNumber.values());
		
		for(A_EnumNumber n : A_EnumNumber.values()) {
			System.out.println("Num :::"+n);
		}
	}
}
