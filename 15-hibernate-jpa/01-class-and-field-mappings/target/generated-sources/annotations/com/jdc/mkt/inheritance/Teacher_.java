package com.jdc.mkt.inheritance;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Teacher.class)
public abstract class Teacher_ extends com.jdc.mkt.inheritance.Account_ {

	public static final String CAR = "car";

	
	/**
	 * @see com.jdc.mkt.inheritance.Teacher#car
	 **/
	public static volatile SingularAttribute<Teacher, Car> car;
	
	/**
	 * @see com.jdc.mkt.inheritance.Teacher
	 **/
	public static volatile EntityType<Teacher> class_;

}

