// public can only be used in owner class
public class F_NestedClass{

	static String static_value;
	
	// Inner Class
	class InstanceClass{}

	// Static Class
	static class StaticClass{
		static void useStatic(){
			System.out.println(static_value);
		}
	}

	void useLocalClass(){
		// Local Class
		class Local{}
	}
}

 class ClassB{}
