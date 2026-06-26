package com.jdc.mkt.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Contact.class)
public abstract class Contact_ {

	public static final String PRIMARY_PHONE = "primaryPhone";
	public static final String ID = "id";
	public static final String EMPLOYEE = "employee";
	public static final String SECONDARY_PHONE = "secondaryPhone";

	
	/**
	 * @see com.jdc.mkt.model.Contact#primaryPhone
	 **/
	public static volatile SingularAttribute<Contact, String> primaryPhone;
	
	/**
	 * @see com.jdc.mkt.model.Contact#id
	 **/
	public static volatile SingularAttribute<Contact, Integer> id;
	
	/**
	 * @see com.jdc.mkt.model.Contact#employee
	 **/
	public static volatile SingularAttribute<Contact, Employee> employee;
	
	/**
	 * @see com.jdc.mkt.model.Contact
	 **/
	public static volatile EntityType<Contact> class_;
	
	/**
	 * @see com.jdc.mkt.model.Contact#secondaryPhone
	 **/
	public static volatile SingularAttribute<Contact, String> secondaryPhone;

}

