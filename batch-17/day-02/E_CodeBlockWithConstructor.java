class E_CodeBlockWithConstructor{

	{
		System.out.println("Starting Instance Block !");
	}

	static{
		System.out.println("Starting Static Block");
	}

	E_CodeBlockWithConstructor(){
		System.out.println("Starting Constructor !");
	}

	static void doSome(){
		{
			System.out.println("Local scope block");
		}
		System.out.println("Do something with static");
		
	}
}
