package com.jdc.mkt.intnetPkg;

import java.util.Set;

import com.jdc.mkt.Internet;

public class ProxyInternet implements Internet{
	
	private Internet internet = new RealInternet();
	
	private static final Set<String> bannedSites = Set.of("facebook.com","youtube.com");

	@Override
	public void connectTo(String host) {
		if(bannedSites.contains(host.toLowerCase())) {
			throw new RuntimeException("Access denied to "+host);
		}
		internet.connectTo(host);
	}

}
