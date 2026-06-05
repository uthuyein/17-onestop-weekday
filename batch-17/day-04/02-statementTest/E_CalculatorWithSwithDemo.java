import java.util.Scanner;

class E_CalculatorWithSwithDemo{
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		greeting("Welcome");
		runProgram();
		greeting("Bye Bye");
	}

	private static void greeting(String message){
		System.out.println("==============================");
		System.out.println("     ===  "+message+"  ===");
		System.out.println("==============================\n");

	}

	private static void runProgram(){
		String yes = "";
		do{
			int result = getInputAndCalculate();
			System.out.println("Result is %d".formatted(result));
			System.out.println("\nDo you want to run again /y ?");
			yes = sc.next();

		}while(yes.equals("y"));
	}

	private static int getInputAndCalculate(){
		System.out.println("Type First Digit !");
		int a = sc.nextInt();

		System.out.println("Type Second Digit !");
		int b = sc.nextInt();

		System.out.println("Type Operator !");
		String ope = sc.next();
		
		return calculate(a,b,ope);
	}

	private static int calculate(int a,int b,String ope){
		return switch(ope){
			case "+"-> a+b;
			case"-" -> a-b;
			case"*" -> a*b;
			case"/" -> a/b;
			case"%" -> a%b;
			default -> 0;
		};
	}
}