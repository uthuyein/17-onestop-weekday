package com.jdc.mkt.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Department.class)
public abstract class Department_ {

	public static final String NAME = "name";
	public static final String EMP = "emp";
	public static final String ID = "id";

	
	/**
	 * @see com.jdc.mkt.model.Department#name
	 **/
	public static volatile SingularAttribute<Department, String> name;
	
	/**
	 * @see com.jdc.mkt.model.Department#emp
	 **/
	public static volatile ListAttribute<Department, Employee> emp;
	
	/**
	 * @see com.jdc.mkt.model.Department#id
	 **/
	public static volatile SingularAttribute<Department, Integer> id;
	
	/**
	 * @see com.jdc.mkt.model.Department
	 **/
	public static volatile EntityType<Department> class_;

}

