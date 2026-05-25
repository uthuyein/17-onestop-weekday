package com.jdc.mkt;

import java.awt.FontFormatException;

public class C_ThrowWithCheckHandler extends _Main {

	public static void main(String[] args) {
		try {
			methodOne();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void methodOne() throws Exception {
		System.out.println("Use method one");
		methodWitchChecked();
		methodWitchUnChecked();
	}
	
//	Convert unchecked to checked exception
	static void methodWitchUnChecked() throws Exception{
		System.out.println("Use unchecked");
		withUnchecked();
	}

	static void methodWitchChecked() throws FontFormatException {
		System.out.println("Use checked");
		withChecked("method checked");
	}

}
