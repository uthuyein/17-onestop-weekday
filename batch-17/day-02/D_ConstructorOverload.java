class D_ConstructorOverload{
	int age;

	 D_ConstructorOverload(){
		System.out.println("Using Constructor");
	}

	 D_ConstructorOverload(String s){
		System.out.println("Using Constructor with String args");
	}

	 D_ConstructorOverload(int a){
	 	age = a;
		System.out.println("Using Constructor with int args");
	}

}
