package com.jdc.mkt.inheritance;

@SuppressWarnings("unused")
public  class ClassA {

	private String value;
	
	private ClassA(){
		super();
		value = null;
	}
	
	 ClassA(String value){
		this.value = value;
	}
	
	final void useA() {
		
	}
}
