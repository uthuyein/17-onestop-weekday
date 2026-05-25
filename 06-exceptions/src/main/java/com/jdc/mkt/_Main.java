package com.jdc.mkt;

import java.awt.FontFormatException;

public class _Main {

	static void withChecked(String font) throws FontFormatException {
		System.out.println("Starting withChecked method");
		throw new FontFormatException(font);
	}
	
	static void withUnchecked() throws RuntimeException{
		System.out.println("Starting withUnChecked method");
		throw new RuntimeException();
	}
}
