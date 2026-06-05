package com.jdc.mkt.abstractfactory;

public interface  DataBaseFactory {

	 Connection createConnection();
	 Command createCommand();
	 
	 
}
