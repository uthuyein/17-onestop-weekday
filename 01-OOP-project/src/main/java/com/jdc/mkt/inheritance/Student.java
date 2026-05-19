package com.jdc.mkt.inheritance;

public class Student extends Human{

	
	@Override
//	Same method signature
//	Aleast same access level or more access
	public void eat() {
		System.out.println("Never eat fishy !");
	}
	
	@Override
//	Aleast same return type or child
	ClassB getObj() {
//		return new ClassB();
//		return new ClassC();
//		return (ClassB)new ClassA();
		
		ClassC c = new ClassC("v");
		c.useA();
		c.useB();
		
		return c;
	}
}
