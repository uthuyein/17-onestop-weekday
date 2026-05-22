package com.jdc.mkt.def;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings({"unused","serial"})
public class DefaultDemo implements Serializable{

	
	void show() {
		doSomething();
	}
	
	@Deprecated
	void doSomething() {
		String value = "hh"; //unused
	}
	
	@SafeVarargs
	static <T>void use(T...strs) {}
	
}

@FunctionalInterface
interface Tester{
	void show();
}
