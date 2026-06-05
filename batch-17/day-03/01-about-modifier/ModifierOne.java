class ModifierOne{
	String defaultValue;
	public String publicValue;
	protected String protectedValue;
	private String privateValue;

	 ModifierOne(){}

	void show(){
		System.out.println(publicValue);
	}
}