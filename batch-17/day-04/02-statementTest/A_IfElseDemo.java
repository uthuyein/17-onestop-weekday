class A_IfElseDemo{
	public static void main(String[] args) {
		String name = args[0];
		useNestedIfElse(name);
		
	}

	static void useNestedIfElse(String name){
		if(name.equals("Andrew")){
			System.out.println("Your name is Andrew");
		}
		else if(name.equals("John")){
			System.out.println("Your name is John");
		}
		else if(name.equals("William")){
			System.out.println("Your name is William");
		}
		else{
			System.out.println("Your name is something wrong");
		}
	}

	static void useIfElse(String name){
		if(name.equals("Andrew")){
			System.out.println("Your name is Andrew");
		}else{
			System.out.println("Your name isn't Andrew");
		}
	}
}