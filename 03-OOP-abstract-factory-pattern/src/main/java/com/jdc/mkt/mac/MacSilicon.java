package com.jdc.mkt.mac;

public class MacSilicon extends MacFactory{

	@Override
	public void createButton() {
		System.out.println("Create button with silicon style");
	}

	@Override
	public void createCheckbox() {
		System.out.println("Create checkbox with rectangle shape and orange with white color");
	}
}
