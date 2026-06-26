package com.jdc.mkt.inheritance;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Officer.class)
public abstract class Officer_ extends com.jdc.mkt.inheritance.Account_ {

	public static final String LAPTOP = "laptop";

	
	/**
	 * @see com.jdc.mkt.inheritance.Officer#laptop
	 **/
	public static volatile SingularAttribute<Officer, String> laptop;
	
	/**
	 * @see com.jdc.mkt.inheritance.Officer
	 **/
	public static volatile EntityType<Officer> class_;

}

