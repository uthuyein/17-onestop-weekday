package com.jdc.mkt;

public class F_CustomException {

	public static void main(String[] args) {
		try {
			useCustomException(" ");
			
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	static void useCustomException(String value)  {

		if (value == null || value.isBlank()) {
			throw new MyCustomException("Invalid value.");
		}
		System.out.println("String value ::: " + value);
	}
}

@SuppressWarnings("serial")
class MyCustomException extends RuntimeException {

	public MyCustomException(String message) {
		super(message);
	}
}
