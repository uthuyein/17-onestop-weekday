package com.jdc.mkt.encapsulation.inter;

public class Main {

	public static void main(String[] args) {
		Work work = new Student("Andrew", 5);
		work.study();
	}
}

interface Work {
	void study();
}

class Student implements Work {
	public String name;
	public int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void study() {
		System.out.println("%s, your age is over %d,so you can start to learn !".formatted(name, age));
	}

}