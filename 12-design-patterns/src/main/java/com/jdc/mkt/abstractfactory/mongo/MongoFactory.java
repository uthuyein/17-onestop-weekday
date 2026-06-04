package com.jdc.mkt.abstractfactory.mongo;

import com.jdc.mkt.abstractfactory.Command;
import com.jdc.mkt.abstractfactory.Connection;
import com.jdc.mkt.abstractfactory.DataBaseFactory;

public class MongoFactory implements DataBaseFactory{

	@Override
	public Connection createConnection() {
		return new MongoConnection();
	}

	@Override
	public Command createCommand() {
		return new MongoCommand();
	}

	
}
