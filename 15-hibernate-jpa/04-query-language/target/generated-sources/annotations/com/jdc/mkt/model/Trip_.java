package com.jdc.mkt.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import java.time.LocalTime;

@StaticMetamodel(Trip.class)
public abstract class Trip_ {

	public static final String PICKUP_POINT = "pickupPoint";
	public static final String COST = "cost";
	public static final String TRIP_DATE = "tripDate";
	public static final String DROP_OFF_POINT = "dropOffPoint";
	public static final String ID = "id";
	public static final String TRIP_TIME = "tripTime";

	
	/**
	 * @see com.jdc.mkt.model.Trip#pickupPoint
	 **/
	public static volatile SingularAttribute<Trip, String> pickupPoint;
	
	/**
	 * @see com.jdc.mkt.model.Trip#cost
	 **/
	public static volatile SingularAttribute<Trip, Double> cost;
	
	/**
	 * @see com.jdc.mkt.model.Trip#tripDate
	 **/
	public static volatile SingularAttribute<Trip, LocalDate> tripDate;
	
	/**
	 * @see com.jdc.mkt.model.Trip#dropOffPoint
	 **/
	public static volatile SingularAttribute<Trip, String> dropOffPoint;
	
	/**
	 * @see com.jdc.mkt.model.Trip#id
	 **/
	public static volatile SingularAttribute<Trip, Integer> id;
	
	/**
	 * @see com.jdc.mkt.model.Trip
	 **/
	public static volatile EntityType<Trip> class_;
	
	/**
	 * @see com.jdc.mkt.model.Trip#tripTime
	 **/
	public static volatile SingularAttribute<Trip, LocalTime> tripTime;

}

