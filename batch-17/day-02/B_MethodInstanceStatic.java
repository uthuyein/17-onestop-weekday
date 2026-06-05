class B_MethodInstanceStatic{
	static String static_value = "static value";
	String instance_value = "instance value";

	static void static_method(){
		System.out.println(static_value);

		// can't use instance directly
		B_MethodInstanceStatic m = new B_MethodInstanceStatic();
		System.out.println(m.instance_value);
	}

	void instance_method(){
		System.out.println(static_value);
		System.out.println(instance_value);
	}
}
