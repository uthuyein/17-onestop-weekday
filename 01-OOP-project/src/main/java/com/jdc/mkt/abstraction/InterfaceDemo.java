package com.jdc.mkt.abstraction;

public class InterfaceDemo {

	public static void main(String[] args) {
		Worker sale = new SalesMan();
		sale.doWork();

		Worker worker = new Worker() {

			@Override
			public void doWork() {
				System.out.println("Do something !");
			}
		};
		worker.doWork();
		worker.doSomething();
		Worker.show();
	}
}

interface Worker {
	public static final int value = 20;

	default void doSomething() {
		System.out.println("Do something from worker");
	}

	static void show() {
		System.out.println("Show something from worker");
	}

	void doWork();
}

class SalesMan implements Worker {

	@Override
	public void doWork() {
		System.out.println("Sale something");
	}
}
