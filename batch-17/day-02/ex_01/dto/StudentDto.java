package dto;
public class StudentDto{
	String name;
	int age;

	public StudentDto(String n,int a){
		name = n ;
		age = a;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	
}
