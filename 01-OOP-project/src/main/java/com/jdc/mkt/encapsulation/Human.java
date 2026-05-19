package com.jdc.mkt.encapsulation;

public class Human {

	private String name;
	private int age;

//	mutators
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = checkAge(age);
	}

//	accessors
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private int checkAge(int age) {
		return age > 0 ? age : 1;
	}
}
