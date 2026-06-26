package com.jdc.mkt.inheritance;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Student.class)
public abstract class Student_ extends com.jdc.mkt.inheritance.Account_ {

	public static final String HOBBIES = "hobbies";

	
	/**
	 * @see com.jdc.mkt.inheritance.Student#hobbies
	 **/
	public static volatile ListAttribute<Student, String> hobbies;
	
	/**
	 * @see com.jdc.mkt.inheritance.Student
	 **/
	public static volatile EntityType<Student> class_;

}

