package com.jdc.mkt.abstractfactory.mysql;

import com.jdc.mkt.abstractfactory.Connection;

public class MysqlConnection implements Connection{

	@Override
	public void connect() {
		System.out.println("Connect with mysql database.");
	}

}
