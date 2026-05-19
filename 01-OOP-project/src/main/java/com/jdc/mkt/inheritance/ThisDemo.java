package com.jdc.mkt.inheritance;

public class ThisDemo {

	public static void main(String[] args) {
		ClassX  x = new ClassY();
		System.out.println("Value ::: "+x.getValue());
	}
}
class ClassY extends ClassX{
	ClassY(){
		this("Child Default");
	}
	ClassY(String v){
		super(v);
	}
}

class ClassX{
private String value;
	
	ClassX(){
		this("Parent Default");
	}
	
	ClassX(String value){
		this.value = value;
	}
	
	String getValue() {
		return value;
	}
}


