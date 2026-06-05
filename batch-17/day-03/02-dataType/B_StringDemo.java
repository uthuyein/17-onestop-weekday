class B_StringDemo{
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");

		System.out.println("s1 == s2 :"+ (s1 == s2) +"   s1 == s3 ::"+ (s1 == s3));
		System.out.println("s1.equals(s2) :"+s1.equals(s2) +"   s1.equals(s3) ::"+s1.equals(s3));

		// Don't use +,concat() when needs to be repeatly.
		// Used StringBuffer or StringBuilder
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Java");
		sb.append(" Developer");
		System.out.println(sb.toString());

		// String Method
		// Format Specifier String %s,Integer %d,Float %f,...
		String message = String.format("Hello %s ,your age is %d","Andrew",23);
		String newFormat = "Hello %s".formatted("java");

		System.out.println(message);
		System.out.println("new Format :"+newFormat);

		String seq = message.substring(6,12);
		System.out.println(seq);

		System.out.println(seq.toLowerCase());
		System.out.println(seq.toUpperCase());



	}
}








