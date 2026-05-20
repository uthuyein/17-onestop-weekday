package com.jdc.mkt;

public class D_ISPDemo {

	public static void main(String[] args) {
		Human h = new Human();
		h.eat();
		h.work();
	}
}

//Bad Design
interface Worker{
	void work();
	void eat();
}

// Good Design
interface Workable{
	void work();
}
interface Eatable{
	void eat();
}

class Robot implements Workable{
	@Override
	public void work() {
		System.out.println("Work on project site!");
	}	
}

class Human implements Workable,Eatable{
	@Override
	public void work() {
		System.out.println("Work on project site!");
	}

	@Override
	public void eat() {
		System.out.println("Eat something");
	}
	
}
