package com.jdc.mkt.model.dto;

import java.time.LocalDate;

public record SelectPassengerDriverCarTripDate(
		String passenger,
		String driver,
		String number,
		LocalDate tripDate
		) {

	@Override
	public final String toString() {	
		return """
				Passenger       : %s
				Driver          : %s
				Car Licence     : %s
				Trip Date       : %s
				""".formatted(passenger,driver,number,tripDate);
	}
}
