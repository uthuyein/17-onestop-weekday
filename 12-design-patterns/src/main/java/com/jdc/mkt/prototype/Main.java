package com.jdc.mkt.prototype;

public class Main {

//	Copy obj and data 
	public static void main(String[] args) {
		Car tesla = new Car("tesla", "grey");
		
		Car telsaClone = (Car)tesla.clone();
		System.out.println(telsaClone);
	}
}
