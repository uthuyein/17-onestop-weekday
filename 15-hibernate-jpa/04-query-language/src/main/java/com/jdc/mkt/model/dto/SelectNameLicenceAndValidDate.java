package com.jdc.mkt.model.dto;

import java.time.LocalDate;

public record SelectNameLicenceAndValidDate(
		String name,
		String number,
		LocalDate validDate
		) {

}
