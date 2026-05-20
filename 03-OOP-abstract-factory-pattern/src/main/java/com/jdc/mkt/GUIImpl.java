package com.jdc.mkt;

import com.jdc.mkt.mac.Mac;
import com.jdc.mkt.mac.MacIntel;
import com.jdc.mkt.mac.MacMOne;
import com.jdc.mkt.mac.MacMTwo;
import com.jdc.mkt.window.Window;
import com.jdc.mkt.window.WindowEleven;
import com.jdc.mkt.window.WindowVista;

public class GUIImpl implements GUIFactory{
	
	@Override
	public Mac createMac(String product) {
		return switch(product) {
		case "intel" -> new MacIntel();
		case "m1" -> new MacMOne();
		case "m2" -> new MacMTwo();
		default -> null;
		};
	}

	@Override
	public Window createWindow(String product) {
		return switch(product) {
		case "vista" -> new WindowVista();
		case "eleven" -> new WindowEleven();
		default -> null;
		};
	}

	

}
