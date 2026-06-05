package com.jdc.mkt;

public class Radio implements Device{

	@Override
	public void on() {
		System.out.println("Radio is switching on.");	
	}

	@Override
	public void off() {
		System.out.println("Radio is switching off.");	
	}

	@Override
	public void setVolume(int value) {
		System.out.println("Radio volume is set to "+value);
	}

}
