package com.jdc.mkt.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		
//		Animal an = new Cat();
//		an.eat();
		
		Animal animal = new Animal() {

			@Override
			void eat() {
				System.out.println("Animal using");
			}
			
		};
		animal.eat();
		
	}
}

class Cat extends Pet{

	@Override
	void eat() {
		System.out.println("Cat using");
	}
	
}
abstract  class Pet extends Animal {}

@SuppressWarnings("unused")
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

