// get student'name from console.
// get Java exam mark from console.
// create checkMark method. 
// if 0 >= mark and 50 < mark => fail
// else if 50 >= mark and  80 < mark => pass
// else if  80 >= mark and 100 <= mark => D 
// else => fail
//Ans : Andrew , your exam is ?
import java.util.Scanner;

class B_ExamMarkDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type student'name !");
		String name = sc.nextLine();

		System.out.println("Type java exam mark !");
		int mark = sc.nextInt();

		String result = checkMark(mark);
		System.out.println("%s ,your exam result is %s.".formatted(name,result));
	}

	private static String checkMark(int mark){
		if(mark < 50 && mark > 0){
			return "fail";

		}else if(mark >= 50 && mark < 80){
			return "pass";

		}else if(mark >= 80 && mark <= 100){
			return "D";

		}else{
			return "wrong input";
		}
	}
}







