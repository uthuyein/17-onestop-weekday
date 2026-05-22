package com.jdc.mkt;

@MyAnno("Human")
@MyAnno("New Human")
public class Human {

	private String name;

	@MyAnno(age = 20)
	private int age;

	@MyAnno
	Human(@MyAnno String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Using constructor");
	}

	@MyAnno(value = "John", age = 30)
	void showInfo() {
		System.out.println("Your name is %s and %d yrs old.".formatted(name, age));
	}
}
