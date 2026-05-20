package com.jdc.mkt;

public class A_SRPDemo {

	public static void main(String[] args) {
		
	}
}

//Bad Design
class Computor{
//	Belong to hardware department
	void display() {
		System.out.println("set display !");
	}
//	Belong to software department
	void installSoftware() {
		System.out.println("Install microsoft software package");
	}
}

//Good Design
class Hardware{
	void display() {
		System.out.println("set display !");
	}
}

class Software{
	void installSoftware() {
		System.out.println("Install microsoft software package");
	}
}






