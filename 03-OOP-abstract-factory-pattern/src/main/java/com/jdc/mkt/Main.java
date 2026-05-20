package com.jdc.mkt;

import java.util.Scanner;

import com.jdc.mkt.mac.Mac;
import com.jdc.mkt.window.Window;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which one do you want window or mac !");
		String name = sc.next();
		System.out.println("""
				Which type product of that
				Eleven
				vista
				intel
				M1
				M2
				""");
		String product = sc.next();
		create(name,product);
		
	}

	static void create(String name, String product) {
		GUIFactory factory = new GUIImpl();
		
		if (name.equals("window")) {
			Window w = factory.createWindow(product);
			w.createWindow();
			
		} else if (name.equals("mac")) {
			Mac m = factory.createMac(product);
			m.createMac();
		}
	}

}
