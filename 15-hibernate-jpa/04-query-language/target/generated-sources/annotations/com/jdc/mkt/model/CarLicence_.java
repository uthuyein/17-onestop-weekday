package com.jdc.mkt.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CarLicence.class)
public abstract class CarLicence_ extends com.jdc.mkt.model.Licence_ {

	public static final String CAR = "car";

	
	/**
	 * @see com.jdc.mkt.model.CarLicence#car
	 **/
	public static volatile SingularAttribute<CarLicence, Car> car;
	
	/**
	 * @see com.jdc.mkt.model.CarLicence
	 **/
	public static volatile EntityType<CarLicence> class_;

}

