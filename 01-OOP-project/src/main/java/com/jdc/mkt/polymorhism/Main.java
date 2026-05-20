package com.jdc.mkt.polymorhism;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
//		Many Behavior
		Human human = new Person();//Andrew()
		human.eat();
		
//		Many Shape
		Object  obj = new Andrew();
		Worker work = new Andrew();
		Human h = new Andrew();
		Person p = new Andrew();
	}
}

class Andrew extends Person{
	@Override
	void eat() {
		System.out.println("Eat something without seafood cause of alergic !");
	}
}

class Person extends Human implements Worker{
	@Override
	public void work() {
		System.out.println("Work on somewhere !");
	}

	@Override
	void sleep() {
		System.out.println("sleep on somewhere !");
	}}

interface Worker{
	void work();
}

abstract class Human{
	abstract void sleep();
	
	void eat() {
		System.out.println("Eat something !");
	}
}