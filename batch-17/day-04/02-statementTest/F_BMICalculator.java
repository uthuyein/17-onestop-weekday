import java.util.Scanner;
class F_BMICalculator{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type name !");
		String name = sc.nextLine();

		System.out.println("Type weight in lb !");
		double lb = sc.nextDouble();

		System.out.println("Type height feets!");
		int ft = sc.nextInt();
		System.out.println("Type height inches!");
		int inc = sc.nextInt();

		String res = checkWeight(lb,ft,inc);
		System.out.println("%s ,your BMI result is %s weight".formatted(name,res));
	}

	static double convertToInches(int ft,int inc){
		return (ft*12)+inc;
	}

	static double formulaBMI(double lb,double inc){
		return (lb / (inc*inc) ) * 703;
	}

	static String checkWeight(double lb,int ft,int inc){
		double bmi = formulaBMI(lb,convertToInches(ft,inc));
		
		if(bmi < 18.5){
			return "under";

		}else if(bmi > 18.5 && bmi <24.9){
			return "healthy";

		}else if(bmi > 25.0 && bmi < 29.9){
			return "over";

		}else if(bmi > 30.0){
			return "obsese";
		}
		return "something wrong";
	}
}