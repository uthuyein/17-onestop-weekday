import dto.StudentDto;
import services.StudentService;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Type student name !");
		String name = sc.nextLine();
		System.out.println("Type age !");
		int age = sc.nextInt();

		StudentDto dto = new StudentDto(name,age);
		StudentService service = new StudentService();
		service.show(dto);
	}
}
