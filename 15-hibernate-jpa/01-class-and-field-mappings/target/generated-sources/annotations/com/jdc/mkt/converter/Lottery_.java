package com.jdc.mkt.converter;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Lottery.class)
public abstract class Lottery_ {

	public static final String NUMBER = "number";
	public static final String ID = "id";
	public static final String DIGIT = "digit";

	
	/**
	 * @see com.jdc.mkt.converter.Lottery#number
	 **/
	public static volatile SingularAttribute<Lottery, Integer> number;
	
	/**
	 * @see com.jdc.mkt.converter.Lottery#id
	 **/
	public static volatile SingularAttribute<Lottery, Integer> id;
	
	/**
	 * @see com.jdc.mkt.converter.Lottery
	 **/
	public static volatile EntityType<Lottery> class_;
	
	/**
	 * @see com.jdc.mkt.converter.Lottery#digit
	 **/
	public static volatile SingularAttribute<Lottery, Integer> digit;

}

