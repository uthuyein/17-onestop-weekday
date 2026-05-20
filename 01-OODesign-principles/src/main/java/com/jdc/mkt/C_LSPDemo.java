package com.jdc.mkt;

public class C_LSPDemo {

	public static void main(String[] args) {
		callBird(new Sparrow());
	}
	
	static void callBird(NewBird bird) {
		bird.eat();
	}
}

class Penguin implements NewBird {
	@Override
	public void eat() {
		System.out.println("Eat fish");
	}
}

class Sparrow implements NewBird,Flyable{
	@Override
	public void fly() {
		System.out.println("Sparraw fly over the sky !");
	}

	@Override
	public void eat() {
		System.out.println("Eat insects");
	}
	
}

//Bad Design
interface Bird{
//	it shall be used some type bird which can't fly.
	void fly();
	void eat();
}


//Good Design
interface NewBird{
	void eat();
}
interface Flyable{
	void fly();
}

