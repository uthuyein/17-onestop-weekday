package com.jdc.mkt.abstractfactory.mongo;

import com.jdc.mkt.abstractfactory.Connection;

public class MongoConnection implements Connection{

	@Override
	public void connect() {
		System.out.println("Connect with mongo database.");
	}
}
