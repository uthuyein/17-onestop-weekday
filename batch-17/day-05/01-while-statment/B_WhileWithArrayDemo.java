import java.util.Scanner;

class B_WhileWithArrayDemo{
	private static String []array;
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Type array length !");
		int length = sc.nextInt();
		
		array = new String[length];
		
		saveNames();

		showNames();
	}

	static void saveNames(){
		int a = 0 ;

		while(a < array.length){
			System.out.println("Type name ! ");
			String name = sc.next();
			array[a] = name ;
			a ++;
		}
	}

	static void showNames(){
		int a = 0 ;

		while(a < array.length){
			System.out.println(array[a]);
			a ++ ;
		}
	}
}