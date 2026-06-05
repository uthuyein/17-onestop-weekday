package com.jdc.mkt;

import com.jdc.mkt.intnetPkg.ProxyInternet;

public class Main {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		internet.connectTo("google.com");
		
		try {
			internet.connectTo("facebook.com");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


