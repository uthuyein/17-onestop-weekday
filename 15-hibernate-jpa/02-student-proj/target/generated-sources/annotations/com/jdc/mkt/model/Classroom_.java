package com.jdc.mkt.model;

import com.jdc.mkt.model.listener.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Classroom.class)
public abstract class Classroom_ {

	public static final String TIMES = "times";
	public static final String NAME = "name";
	public static final String ID = "id";

	
	/**
	 * @see com.jdc.mkt.model.Classroom#times
	 **/
	public static volatile SingularAttribute<Classroom, Times> times;
	
	/**
	 * @see com.jdc.mkt.model.Classroom#name
	 **/
	public static volatile SingularAttribute<Classroom, String> name;
	
	/**
	 * @see com.jdc.mkt.model.Classroom#id
	 **/
	public static volatile SingularAttribute<Classroom, Integer> id;
	
	/**
	 * @see com.jdc.mkt.model.Classroom
	 **/
	public static volatile EntityType<Classroom> class_;

}

