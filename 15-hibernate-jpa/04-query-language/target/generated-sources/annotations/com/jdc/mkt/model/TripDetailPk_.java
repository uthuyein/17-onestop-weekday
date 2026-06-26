package com.jdc.mkt.model;

import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TripDetailPk.class)
public abstract class TripDetailPk_ {

	public static final String CAR_LICENCE_ID = "carLicenceId";
	public static final String DRIVER_LICENCE_ID = "driverLicenceId";
	public static final String PASSENGER_ID = "passengerId";
	public static final String TRIP_ID = "tripId";

	
	/**
	 * @see com.jdc.mkt.model.TripDetailPk#carLicenceId
	 **/
	public static volatile SingularAttribute<TripDetailPk, String> carLicenceId;
	
	/**
	 * @see com.jdc.mkt.model.TripDetailPk#driverLicenceId
	 **/
	public static volatile SingularAttribute<TripDetailPk, String> driverLicenceId;
	
	/**
	 * @see com.jdc.mkt.model.TripDetailPk#passengerId
	 **/
	public static volatile SingularAttribute<TripDetailPk, Integer> passengerId;
	
	/**
	 * @see com.jdc.mkt.model.TripDetailPk#tripId
	 **/
	public static volatile SingularAttribute<TripDetailPk, Integer> tripId;
	
	/**
	 * @see com.jdc.mkt.model.TripDetailPk
	 **/
	public static volatile EmbeddableType<TripDetailPk> class_;

}

