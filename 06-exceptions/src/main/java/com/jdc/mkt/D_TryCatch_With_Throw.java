package com.jdc.mkt;

public class D_TryCatch_With_Throw extends _Main {

	public static void main(String[] args) {
		useChecked();
	}

	static void useChecked() throws RuntimeException{
		try {
			withChecked("checked");
			
		} catch (Exception e) {
			throw new RuntimeException("Convert check to uncheck Runtime");
		}
	}
}
