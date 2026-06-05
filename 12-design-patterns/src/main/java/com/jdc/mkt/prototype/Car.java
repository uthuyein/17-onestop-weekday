package com.jdc.mkt.prototype;

public class Car implements Prototype{
	
	private String model;
	private String color;

	
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}


	@Override
	public Prototype clone()  {
		return new Car(this.model, this.color);
	}
	
	@Override
	public String toString() {
		return model +"\t"+ color;
	}
}
