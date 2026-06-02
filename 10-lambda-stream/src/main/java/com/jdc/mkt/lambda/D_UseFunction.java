package com.jdc.mkt.lambda;

import java.util.function.Function;

public class D_UseFunction {
	
	public static void main(String[] args) {
		useMethodRefConvert("22");
	}

	static void useLambda(String value) {
		Function<String, Integer> f1 = s -> Integer.parseInt(s);
		System.out.println("Integer value ::: "+f1.apply(value));
	}
	
	static void useMethodRefConvert(String value) {
		Function<String, Integer> f1 = D_UseFunction :: convert;
		System.out.println("Integer value ::: "+f1.apply(value));
	}
	
	static int convert(String str) {
		return Integer.parseInt(str)+10;
	}
	
	static void useWithoutLambda(String value) {
		Function<String, Integer> f1 = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		System.out.println("Integer value ::: "+f1.apply(value));
	}
}
