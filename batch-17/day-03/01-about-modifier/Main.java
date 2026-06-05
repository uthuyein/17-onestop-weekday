import pkgOne.ModifierTwo;

class Main extends ModifierTwo{
	public static void main(String[] args) {

		// Same Package
		ModifierOne one = new ModifierOne();
		one.defaultValue = "default";
		one.publicValue = "public";
		one.protectedValue = "protected";
		// one.privateValue = "private";

		// Same Package with extends 
		Main data = new Main();
		data.publicValue = "public";
	    data.protectedValue = "protected";

		// Different Package
		ModifierTwo two = new ModifierTwo();
		two.publicValue = "public";
		// two.defaultValue = "default";
		// two.protectedValue = "protected";
		// one.privateValue = "private";



	}
}