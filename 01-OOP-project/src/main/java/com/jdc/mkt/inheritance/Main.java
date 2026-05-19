package com.jdc.mkt.inheritance;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		Human st = new Student();
//		st.eat();
//		sleep() can't access cause of parent accessibility
//		st.sleep();
		
		
		ClassA a = new ClassB("v"); // implicit
		ClassB b = (ClassB) a; // explicit (classCastException )
		b.useB();
	}
}
