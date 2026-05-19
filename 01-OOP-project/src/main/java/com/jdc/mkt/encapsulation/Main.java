package com.jdc.mkt.encapsulation;
import com.jdc.mkt.encapsulation.pkgOne.Human;
public class Main {

	public static void main(String[] args) {
		Human h = new Human();
		h.setName("Andrew");
		
		
		System.out.println(h.getName());
	}

}
