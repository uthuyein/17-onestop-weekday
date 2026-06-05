package com.jdc.mkt.decorator;

public class SimpleCoffee implements Coffee{

	@Override
	public String description() {
		return "Simple coffee";
	}

	@Override
	public double cost() {
		return 3500.00;
	}

}
