package com.jdc.mkt.abstractfactory.mysql;

import com.jdc.mkt.abstractfactory.Command;
import com.jdc.mkt.abstractfactory.Connection;
import com.jdc.mkt.abstractfactory.DataBaseFactory;

public class MySqlFactory implements DataBaseFactory{

	@Override
	public Connection createConnection() {
		return new MysqlConnection();
	}

	@Override
	public Command createCommand() {
		return new MySqlCommand();
	}

}
