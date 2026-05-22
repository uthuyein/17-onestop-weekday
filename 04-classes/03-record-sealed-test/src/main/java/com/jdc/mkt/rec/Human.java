package com.jdc.mkt.rec;

import java.time.LocalDate;

public record Human (String name,int age,LocalDate dob){
	
//	Secondary
	public Human() {
		this("no name",1,LocalDate.of(2000, 01, 01));
	}
	
	public Human(String name,int age) {
		this(name,age,LocalDate.of(2000, 01, 01));
	}
	
//	Compact
	public Human{
		if(dob.getYear() > LocalDate.now().getYear()) {
			throw new IllegalArgumentException();
		}
	}
		
//	Canonical
//	public Human (String name,int age,LocalDate dob){
//		this.name = name;
//		this.age = checkAge(age);
//		this.dob = dob;
//	}
	

	 int checkAge(int age) {
		return age > 0 ? age : 1;
	}
	 
	 public String getName() {
		 return name;
	 }
}

interface Tester{}
record ClassA(int data) implements Tester{}





