package com.jdc.mkt.abstractfactory.mongo;

import com.jdc.mkt.abstractfactory.Command;

public class MongoCommand implements Command {

	@Override
	public void someCommand() {
		System.out.println("Using mongo commands");
	}
}
