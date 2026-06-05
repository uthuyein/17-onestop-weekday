package com.jdc.mkt;

public class TV implements Device{

	@Override
	public void on() {
		System.out.println("TV is switching on.");	
	}

	@Override
	public void off() {
		System.out.println("TV is switching off.");	
	}
	

	@Override
	public void setVolume(int value) {
		System.out.println("TV volume is set to "+value);
	}


}
