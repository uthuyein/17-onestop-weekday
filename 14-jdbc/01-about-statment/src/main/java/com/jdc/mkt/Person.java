package com.jdc.mkt;

public record Person(Integer id,String name,Integer age) {

	public Person(String name,Integer age){
		this(0,name,age);		
	}
	
	
}
