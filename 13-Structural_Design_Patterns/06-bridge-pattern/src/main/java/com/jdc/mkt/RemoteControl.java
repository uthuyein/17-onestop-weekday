package com.jdc.mkt;

public class RemoteControl {

	Device device;

	public RemoteControl(Device device) {
		super();
		this.device = device;
	}
	
	public void powerOn() {
		device.on();
	}
	
	public void powerOff() {
		device.off();
	}
	
}
