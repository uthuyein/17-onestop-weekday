package com.jdc.mkt.reflect;

import java.lang.reflect.Field;

public class Student {

	@StudentAnno("Andrew")
	private String name;
	
	@StudentAnno
	private int age;
	
	private void checkAnno() {
		Field[] fields = getClass().getDeclaredFields();
		for(Field f : fields) {
			StudentAnno anno = f.getDeclaredAnnotation(StudentAnno.class);
			
			if(null != anno) {
				if(f.getName().equals("name")){
					this.name =  anno.value();
					
				}else if(f.getName().equals("age")){
					this.age = anno.age();
				}
			}
		}		
	}
	
	String getName() {
		checkAnno();
		return name;
	}
	
	int getAge() {
		checkAnno();
		return age;
	}
}
