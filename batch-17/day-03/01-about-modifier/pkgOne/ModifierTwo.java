package pkgOne;

public class ModifierTwo{
	String defaultValue;
	public String publicValue;
	protected String protectedValue;
	private String privateValue;

	void show(){
		System.out.println(publicValue);
	}
}