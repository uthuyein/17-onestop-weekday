package com.jdc.mkt;

public class E_DIPDemo {

	public static void main(String[] args) {
//		Bad Design
		MyService service = new MyService(new MySqlDatabase());
		service.service();
		
//		Good Design
		MyNewService con = new MyNewService(new Postgresql());
		con.service();
	}
}
//Good Design
interface Connector{
	void connect();
}

class Postgresql implements Connector{
	@Override
	public void connect() {
		System.out.println("Connect with postgresql db.");
	}	
}

class MongoDb implements Connector{
	@Override
	public void connect() {
		System.out.println("Connect with mongo db.");
	}	
}

class MyNewService{
	Connector db;
	
	MyNewService(Connector db){
		this.db = db;
	}
	
	void service() {
		db.connect();
	}
}

//Bad Design
class MySqlDatabase {
	void connect() {
		System.out.println("connect with mysql database");
	}
}

class MyService{
	MySqlDatabase db;
	
	MyService(MySqlDatabase db){
		this.db = db;
	}
	
	void service() {
		db.connect();
	}
}




