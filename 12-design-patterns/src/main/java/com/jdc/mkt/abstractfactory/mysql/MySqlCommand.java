package com.jdc.mkt.abstractfactory.mysql;

import com.jdc.mkt.abstractfactory.Command;

public class MySqlCommand implements Command{

	@Override
	public void someCommand() {
		System.out.println("Using mysql commands");
	}

}
