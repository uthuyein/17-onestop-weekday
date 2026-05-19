package com.jdc.mkt.encapsulation.pkgOne;

public class Human {

	String name;
	int age;
	
//	mutators
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	accessors
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
