// create C_CalculatorDemo class
// get first number from console.
// get second number form console.
// get operator from console(+,-,X,%,/).
// show result .eg.(when operator is + ,the result is first+scecond)
import java.util.Scanner;
import javax.swing.JOptionPane;

class C_CalculatDemo{


	public static void main(String[] args) {

		// Data d = getFromMain(args);
		Data d = getFormSwing();
		int result = calculate(d);

		System.out.println("Calcualor result is %d".formatted(result));
	}

	private static Data getFormSwing(){
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("First Number !"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Second Number !"));
		String ope = JOptionPane.showInputDialog("Operator !");
		
		return new Data(a,b,ope);
	}

	private static Data getFromMain(String[] array){
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		String ope  = array[2];
		return new Data(a,b,ope);
	}

	private static Data getFromScanner(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Type First Digit !");
		int a = sc.nextInt();

		System.out.println("Type Second Digit !");
		int b = sc.nextInt();

		System.out.println("Type Operator !");
		String ope = sc.next();
		return new Data(a,b,ope);
	}

	

	private static int calculate(Data d){
		if(d.getOpe().equals("+")){
			return d.getFirst()+d.getSecond();

		}else if(d.getOpe().equals("-")){
			return d.getFirst()-d.getSecond();

		}else if(d.getOpe().equals("X")){
			return d.getFirst()*d.getSecond();

		}else if(d.getOpe().equals("/")){
			return d.getFirst()/d.getSecond();

		}else if(d.getOpe().equals("%")){
			return d.getFirst()%d.getSecond();

		}else{
			return 0;
		}
	}

	private static class Data{
		int a,b;
		String o;

		Data (int aa,int bb,String ope){
			a = aa;
			b = bb;
			o = ope;
		}

		int getFirst(){
			return a;
		}

		int getSecond(){
			return b;
		}

		String getOpe(){
			return o;
		}

	}
}