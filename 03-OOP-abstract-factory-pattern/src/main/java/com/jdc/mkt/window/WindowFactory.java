package com.jdc.mkt.window;

import com.jdc.mkt.Button;
import com.jdc.mkt.Checkbox;

public abstract class WindowFactory implements Button,Checkbox {

	@Override
	public void createButton() {
		System.out.println("Create button with the shape is circle and the color is black over white");
	}
}
