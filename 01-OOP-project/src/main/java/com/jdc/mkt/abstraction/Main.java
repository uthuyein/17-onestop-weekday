package com.jdc.mkt.abstraction;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Pet();
		animal.eat();
		animal.show();
		Animal.hide();
	}
}

abstract class Animal {
	
	String name;
	private static int age;
	
	Animal(){
		System.out.println("Using Animal Constructor");
	}

	abstract void eat();

	 void show() {
		System.out.println("Show something from animal");
	}

	static void hide() {
		System.out.println("Hide something from animal");
	}
}

class Pet extends Animal {

	@Override
	void eat() {
		System.out.println("Feeding from Owner");
	}
}
