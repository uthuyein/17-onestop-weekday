package com.jdc.mkt;

import com.jdc.mkt.mac.Mac;
import com.jdc.mkt.window.Window;

public interface GUIFactory {

	Mac createMac(String product);
	Window createWindow(String product);
}
