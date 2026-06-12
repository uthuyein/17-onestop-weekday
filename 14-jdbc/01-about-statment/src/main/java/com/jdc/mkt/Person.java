package com.jdc.mkt;

public record Person(int id,String name,int age) {

	Person(String name,int age){
		this(0,name,age);		
	}
}
