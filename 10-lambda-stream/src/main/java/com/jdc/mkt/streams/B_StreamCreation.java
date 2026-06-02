package com.jdc.mkt.streams;

import java.util.Arrays;
import java.util.List;

public class B_StreamCreation {

	public static void main(String[] args) {
		useCollectionOrArray();
	}
	
	static void useCollectionOrArray() {
		List<String> list = List.of("1","2","3","4","5","6","7","8","9");
		String[] array = {"1","2","3","4","5","6","7","8","9"};
		
		var listRes = list.stream().mapToInt(Integer :: parseInt).sum();
		System.out.println("List result :: "+listRes);
		
		var arrayRes = Arrays.stream(array)
						.mapToInt(Integer :: parseInt)
						.sum();
		
		System.out.println("Array result :: "+arrayRes);
	}
}
