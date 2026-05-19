package com.jdc.mkt.abstraction;

public class FinalDemo {
	
	public static void main(String[] args) {
		String name = "default" ;	
		Action a = new Action() {

			@Override
			public void useOuterValue() {
				System.out.println("Outer value :: "+name);
			}			
		};
		a.useOuterValue();
		useFinal();
		
	}
	
	static void useFinal() {
//		Effecitivily final
		 int value = 50;
		class Human{
			void act() {
				System.out.println("Value ::: "+value);
			}
		}
		Human h = new Human();
//		value = 60 ;
		h.act();
	}
}

interface Action{
//	Effecitivitely final
	int value = 50 ;
	
	default int useValue() {
		return value;
	}
	
	void useOuterValue();
}
