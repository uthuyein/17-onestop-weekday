package com.jdc.mkt;

public class A_BeforeGenerice {

	public static void main(String[] args) {
		Data d = new Data();
		d.setValue("sss");
		
		int res = (int) d.getValue();
		
		System.out.println(res);
	}
}

class Data{
	private Object value;
	
	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	
	
}
