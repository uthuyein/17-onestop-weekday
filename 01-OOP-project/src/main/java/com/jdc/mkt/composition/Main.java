package com.jdc.mkt.composition;

public class Main {

	public static void main(String[] args) {
		
	}
}

class ClassA{
	void show() {
		System.out.println("Show from A");
	}
}
class ClassB{
   //Composition(Has A)	
	private ClassA a;
	
	ClassB(ClassA a){
		this.a = a;
	}
	void show() {
		a.show();
	}
}
