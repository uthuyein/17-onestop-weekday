class A_WhileDoWhileDemo{
	public static void main(String[] args) {
		useWhile(1);
	}

	private static void useWhile(int a){
		while(a <= 0){
			System.out.println("int a => " + a);
			++ a ;
		}
	}

	private static void useDoWhile(int a){
		do{
			System.out.println("int a => " + a);
			++ a ;

		}while(a <= 0);
	}
}