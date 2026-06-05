class C_MethodOverload{

	void overload_method(){
		System.out.println("Overload without args");
	}

	 void overload_method(String arg){
		System.out.println("Overload with string");
	}
	 void overload_method(int arg){
		System.out.println("Overload with integer");
	}

	void overload_method(int arg,String str){
		System.out.println("Overload with int and string");
	}
}
