import java.util.Scanner;

class C_ArrayDemo{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Type elements !");
		String elements = sc.nextLine();

		String[]array = elements.split(" ");

		System.out.println("Array length : "+array.length);
		System.out.println("First array index : "+array[0]);
		System.out.println("Last array index :"+array[array.length-1]);

		System.out.println("Replace in array[1] !");
		String name = sc.nextLine();
		array[1] = name;
		System.out.println("array[1] : "+ array[1]);
	}
}
