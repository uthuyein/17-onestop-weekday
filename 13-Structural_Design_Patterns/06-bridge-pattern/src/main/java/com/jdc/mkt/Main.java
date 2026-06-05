package com.jdc.mkt;

public class Main {

//	Remote doesn’t care if it’s controlling a TV or a radio
//	Devices can change without modifying the remote
	public static void main(String[] args) {
		AdvancedRemoteControl remote = new AdvancedRemoteControl(new TV());
		remote.powerOn();
		remote.powerOff();
		remote.mute();
	}
}
