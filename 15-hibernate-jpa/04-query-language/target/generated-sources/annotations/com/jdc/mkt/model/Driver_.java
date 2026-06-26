package com.jdc.mkt.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Driver.class)
public abstract class Driver_ {

	public static final String ADDRESS = "address";
	public static final String QUERY_DRIVER_FIND_BY_AGE = "driver.findByAge";
	public static final String QUERY_DRIVER_FIND_BY_NAME_LIKE = "driver.findByNameLike";
	public static final String DOB = "dob";
	public static final String NAME = "name";
	public static final String DRIVER_LICENCE = "driverLicence";
	public static final String ID = "id";
	public static final String NRC = "nrc";

	
	/**
	 * @see com.jdc.mkt.model.Driver#address
	 **/
	public static volatile SingularAttribute<Driver, Address> address;
	
	/**
	 * @see com.jdc.mkt.model.Driver#dob
	 **/
	public static volatile SingularAttribute<Driver, LocalDate> dob;
	
	/**
	 * @see com.jdc.mkt.model.Driver#name
	 **/
	public static volatile SingularAttribute<Driver, String> name;
	
	/**
	 * @see com.jdc.mkt.model.Driver#driverLicence
	 **/
	public static volatile SingularAttribute<Driver, DriverLicence> driverLicence;
	
	/**
	 * @see com.jdc.mkt.model.Driver#id
	 **/
	public static volatile SingularAttribute<Driver, Integer> id;
	
	/**
	 * @see com.jdc.mkt.model.Driver
	 **/
	public static volatile EntityType<Driver> class_;
	
	/**
	 * @see com.jdc.mkt.model.Driver#nrc
	 **/
	public static volatile SingularAttribute<Driver, String> nrc;

}

