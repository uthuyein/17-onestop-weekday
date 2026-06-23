package com.jdc.mkt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "driver_licence_tbl")
@EqualsAndHashCode(callSuper = false)
public class DriverLicence extends Licence{

	@Enumerated(EnumType.STRING)
	private BloodType bloodType;
	
	@Enumerated(EnumType.STRING)
	private LicenceType licenceType;
	
	public enum LicenceType{
		A,B,C,D,E
	}
	
	public enum BloodType {
		A,B,AB,O
	}
}
