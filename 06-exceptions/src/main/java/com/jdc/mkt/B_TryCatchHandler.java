package com.jdc.mkt;

import java.awt.FontFormatException;
import java.util.Scanner;

public class B_TryCatchHandler extends _Main{

	public static void main(String[] args) {
		String res = useTryWithFinally();
		System.out.println(res);
	}
	
	static class Scan implements AutoCloseable{
		@Override
		public void close()  {}}
	
	
	static void useTryWithResource() {
		try(Scanner sc = new Scanner(System.in);
			Scan ss = new Scan()) {
			
			System.out.println("Before invoking check");
			
			withChecked("font error");
			withUnchecked();
			
			System.out.println("After invoking check");
			
		}catch (FontFormatException | RuntimeException e) {		
			System.out.println("Catch block process");			
		}
	}
	
	
	static String useTryWithFinally() {
		try {
			System.out.println("Before invoking check");
			
			withChecked("font error");
			withUnchecked();
			
			System.out.println("After invoking check");
			return "Try block";
			
		}catch (FontFormatException | RuntimeException e) {		
			System.out.println("Catch block process");
			return "Catch block";
			
		}finally {
			System.out.println("Finally");
		}
	}
	
	static void useTryMultiCatch() {
		try {
			System.out.println("Before invoking check");
			withChecked("font error");
			withUnchecked();
			
			System.out.println("After invoking check");
		
//		different type of object can use 
//		}catch (FontFormatException  | IOException | RuntimeException e) {	
			
		}catch (FontFormatException e) {
			System.out.println("Catch block process with fontformatException");
			
		}catch(RuntimeException e) {
			System.out.println("Catch block process with runtimeException");
			
		}catch (Exception e) {
			System.out.println("Catch block process with exception");
		}
					
	}
	
	static void useTryCatch() {		
		try {
			System.out.println("Before invoking check");
			
			withChecked("font error");
			withUnchecked();
			
			System.out.println("After invoking check");
			
		}catch (FontFormatException e) {
			
			System.out.println("Catch block process");
		}
	}
	
	
}
