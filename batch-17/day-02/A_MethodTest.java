class A_MethodTest{
	E_CodeBlockWithConstructor e;
	public static void main(String[] args) {
		
		// static_method();

		//non_static context can't referrenced from static
		// A_MethodTest test = new A_MethodTest();
		// test.instance_method();

		// Use From MethodInstanceStatic
		// B_MethodInstanceStatic.static_method();

		// B_MethodInstanceStatic m = new B_MethodInstanceStatic();
		// m.instance_method();

		// Use From MethodOverload
		// C_MethodOverload m1 = new C_MethodOverload();
		// m1.overload_method(22,"");

		// Use From Constructor
		// D_ConstructorOverload c = new D_ConstructorOverload(23);

		// Use From E_CodeBlockWithConstructor
		// E_CodeBlockWithConstructor c = new E_CodeBlockWithConstructor();
		// E_CodeBlockWithConstructor.doSome();

		// Use From F_NestedClass
		F_NestedClass nest = new F_NestedClass();

	}

	static void static_method(){
		System.out.println("Using static method !");
	}

	void instance_method(){
		System.out.println("Using instance method !");
	}
}
