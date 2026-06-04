package com.jdc.mkt.decorator;

public class Main {

	@SuppressWarnings("unused")
//	This pattern is used for decoration object(milk,form) which is from simple(simple coffee) 
	public static void main(String[] args) {
		
		Coffee simple = new SimpleCoffee();
		
		Coffee milk = new A_MilkCoffee(new SimpleCoffee());
		Coffee form = new B_FormCoffee(new SimpleCoffee());
		
		System.out.println(form.description());
		System.out.println(form.cost());
	}
}




