package com.jdc.mkt.inheritance;

@SuppressWarnings("unused")
public class Human {
	
	private String name;
	
	public Human(){
		super();
		name = null;
		
	}
	
//	Human(String name){
//		this.name = name;
//	}

	private void sleep() {
		System.out.println("Sleep on bed !");
	}
	
	void eat() {
		System.out.println("Eat something !");
	}
	
	ClassB getObj() {
		return new ClassB("v");
//		return new ClassC();
//		return (ClassB)new ClassA();
	}
}
