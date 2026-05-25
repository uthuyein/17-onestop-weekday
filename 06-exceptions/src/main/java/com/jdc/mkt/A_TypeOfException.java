package com.jdc.mkt;

import java.io.File;
import java.io.IOException;

@SuppressWarnings("unused")
public class A_TypeOfException {

	public static void main(String[] args) {
		unchecked();
	}

//	Arithmentic (unchecked)
	static void unchecked() {
		int a = 0;
		int b = 10 / a;

	}

//	IoException (checked)
	static void checked() throws IOException {
		File f = new File("~/MKT/text.txt");
		f.createNewFile();
	}

//	StackOverFlowError (error)
	static int getOpeOne(int a) {
		return getOpeTwo(a);
	}

	static int getOpeTwo(int a) {
		return getOpeOne(a);
	}
}
