class A_OperatorDemo{
	public static void main(String[] args) {
		Integer a = 20 ;
		Integer b = 30 ;

		// Assignment Operator
		// System.out.println("Use += : " + (a += 10));
		// System.out.println("Use *= : " + (a *= 2)+"\n");

		// // Arithmetic Operator
		// System.out.println("Use / : " + (a / 2));
		// System.out.println("Use % : " + (a % 7)+"\n");


		// // Unary Opeartor
		// System.out.println("Use ++ : " + (++a));
		// System.out.println("Use -- : " + (--a)+"\n");

		// // Relational Operator
		// System.out.println("Use >= : " + (a >= b));
		// System.out.println("Use != : " + (a != b));
		// System.out.println("Use instanceOf : " + (a instanceof Number));


		// Logical Operator
		// System.out.println("Use both true : " + (getTrue() || getTrue()));
		// System.out.println("Use true and false : " + (getTrue() || getFalse()));
		// System.out.println("Use false and true : " + (getFalse() || getTrue()));
		// System.out.println("Use reverse : " + (!getFalse())+"\n");
		
		// // Tenary Operator
		// System.out.println("Use tanary : " + (a > b ? "greater than b" : "less than b")+"\n");
		
		// Binary Operator
		//     128	64	32	16	 8  4  2  1
		//    	0    0   0   1   0  1  0  0
		// <<   0    0   1   0   1  0  0  0
		// >>   0    0   0   0   1  0  1  0
 		System.out.println("Use left shift << : " + (a << 1));
		System.out.println("Use right shift >>> : " + (a >>> 1));

	}

	static boolean getTrue(){
		System.out.println("Use getTrue method .");
		return true;
	}

	static boolean getFalse(){
		System.out.println("Use getFalse method .");
		return false;
	}



}