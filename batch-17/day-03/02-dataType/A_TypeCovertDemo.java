import java.util.Scanner;

class A_TypeConvertDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type some number ! ");
		String str = sc.next();

		// Convert String to Integer
		int a = Integer.parseInt(str);
		System.out.println("Integer ::: "+a);

		// Convert String to Long
		long aa = Long.parseLong(str);
		System.out.println("Long ::: "+aa);

		// Convert Long to Integer
		int aaa = (int) aa; //explicit casting
		System.out.println("Integer with casting ::: "+aaa);
		
		Long l = aa;
		int aaaa = l.intValue();
		System.out.println("Integer with wapper method ::: "+aaaa);
	}
}
