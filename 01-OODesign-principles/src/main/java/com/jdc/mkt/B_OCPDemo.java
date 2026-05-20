package com.jdc.mkt;

public class B_OCPDemo {

	public static void main(String[] args) {
		PaymentType type = new AyaPay();
		type.cash();
	}
}

//Good Design
interface PaymentType{
	void cash();
}
class Kpay implements PaymentType{
	@Override
	public void cash() {
		System.out.println("cash with kpay");
	}	
}

class AyaPay implements PaymentType{
	@Override
	public void cash() {
		System.out.println("cash with AyaPay");
	}	
}


//Bad Design
class Payment{
	void cash(String type) {
		if(type.equalsIgnoreCase("kpay")) {
			System.out.println("cash with kpay");
			
		}else if(type.equalsIgnoreCase("aya pay")) {
			System.out.println("cash with aya pay !");
		}
//		if need to be add new payment wavepay,we have to update code 
	}
}
