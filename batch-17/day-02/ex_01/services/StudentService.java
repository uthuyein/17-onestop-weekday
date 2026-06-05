package services;

import dto.StudentDto;

public class StudentService{

	public void show(StudentDto dto){
		System.out.println("Student's name is "+dto.getName()+" and age is "+dto.getAge());
	}
}
