package com.jdc.mkt.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static final String CONTACT = "contact";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String DEPARTMENT = "department";

	
	/**
	 * @see com.jdc.mkt.model.Employee#contact
	 **/
	public static volatile SingularAttribute<Employee, Contact> contact;
	
	/**
	 * @see com.jdc.mkt.model.Employee#name
	 **/
	public static volatile SingularAttribute<Employee, String> name;
	
	/**
	 * @see com.jdc.mkt.model.Employee#id
	 **/
	public static volatile SingularAttribute<Employee, Integer> id;
	
	/**
	 * @see com.jdc.mkt.model.Employee#department
	 **/
	public static volatile SingularAttribute<Employee, Department> department;
	
	/**
	 * @see com.jdc.mkt.model.Employee
	 **/
	public static volatile EntityType<Employee> class_;

}

