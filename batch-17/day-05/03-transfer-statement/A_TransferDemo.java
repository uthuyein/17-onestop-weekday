class A_TransferDemo{
	public static void main(String[] args) {
		labelTest();
	}

	private static void labelTest(){
		skip:
		for(int a = 0 ; a < 5 ; a ++){
			System.out.println("Outer Loop ::: "+a);

			for(int b = 0 ; b < 5 ; b ++){
				if(b == 3){
					// break skip; // will stop to outer
					// continue skip; // will restart from outer
				}
				System.out.print("Inner ::: "+b+"\t");
			}
		}
		System.out.println("End of Method");
	}

	private static void transfer(){
		for(int a = 0 ; a < 5 ; a ++){
			System.out.println("Outer Loop ::: "+a);

			for(int b = 0 ; b < 5 ; b ++){
				if(b == 3){
					// break;  // will stop current loop
					// continue // restart ;
					return; // out from method;
				}
				System.out.print("Inner ::: "+b+"\t");
			}	
		}
	}
}