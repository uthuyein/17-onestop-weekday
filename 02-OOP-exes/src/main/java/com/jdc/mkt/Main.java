package com.jdc.mkt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type animal's name !");
		String name = sc.next();
		Animal animal = getAnimal(name);
		animal.show(); 
		sc.close();
	}
	
	static Animal getAnimal(String name) {
		return switch(name) {
			case "tiger" -> new Tiger();
			case "rabbit" -> new Rabbit();
			case "wolf" -> new Wolf();
			default -> new Animal();
		};
	}
}
class Animal{
	void show() {
		System.out.println("Wild animals hunts prey !");
	}
}
class Tiger extends Animal{
	void show() {
		System.out.println("Tiger hunts prey !");
	}
}
class Rabbit extends Animal{
//	void show() {
//		System.out.println("Rabbit hunts by wild animal  !");
//	}
}
class Sparrow extends Animal{
	void show() {
		System.out.println("Sparrow hunts insects !");
	}
}
class Cat extends Animal{
	void show() {
		System.out.println("Cat feeding by human !");
	}
}
class Wolf extends Animal{
	void show() {
		System.out.println("Wolf hunts prey !");
	}
}
