package com.jdc.mkt.mac;

public class MacIntel extends MacFactory{

	@Override
	public void createButton() {
		System.out.println("Create button with intel style");
	}

	@Override
	public void createCheckbox() {
		System.out.println("Create checkbox with rectangle shape and grey with white color");
	}

}
