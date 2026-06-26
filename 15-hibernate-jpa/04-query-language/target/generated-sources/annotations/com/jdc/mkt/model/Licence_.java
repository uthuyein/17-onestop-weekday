package com.jdc.mkt.model;

import jakarta.persistence.metamodel.MappedSuperclassType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Licence.class)
public abstract class Licence_ {

	public static final String NUMBER = "number";
	public static final String VALID_DATE = "validDate";
	public static final String ISSUE_DATE = "issueDate";

	
	/**
	 * @see com.jdc.mkt.model.Licence#number
	 **/
	public static volatile SingularAttribute<Licence, String> number;
	
	/**
	 * @see com.jdc.mkt.model.Licence#validDate
	 **/
	public static volatile SingularAttribute<Licence, LocalDate> validDate;
	
	/**
	 * @see com.jdc.mkt.model.Licence#issueDate
	 **/
	public static volatile SingularAttribute<Licence, LocalDate> issueDate;
	
	/**
	 * @see com.jdc.mkt.model.Licence
	 **/
	public static volatile MappedSuperclassType<Licence> class_;

}

