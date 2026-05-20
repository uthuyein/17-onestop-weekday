package com.jdc.mkt.abstraction;

public class InterfaceTwoDemo {

	public static void main(String[] args) {
		
	}
}

interface Inter{
	default void doSomething() {
		System.out.println("Do something from inter");
	}
}

interface InterOne extends Inter{
	@Override
	default void doSomething() {
		Inter.super.doSomething();
	}
}

interface InterTwo extends Inter{
	@Override
	default void doSomething() {
		Inter.super.doSomething();
	}
}

// Solved of Diamond problem
interface InterThree extends InterOne,InterTwo{
	@Override
	default void doSomething() {
		InterOne.super.doSomething();
	}
	
}
