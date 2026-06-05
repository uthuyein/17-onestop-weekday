package com.jdc.mkt.intnetPkg;

import com.jdc.mkt.Internet;

class RealInternet implements Internet{
	
	@Override
	public void connectTo(String host) {
		System.out.println("Connecting to "+host);
	}

}
