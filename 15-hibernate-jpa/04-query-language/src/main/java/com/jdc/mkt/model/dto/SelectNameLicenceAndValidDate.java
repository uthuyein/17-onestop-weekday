package com.jdc.mkt.model.dto;

import java.sql.Date;

public record SelectNameLicenceAndValidDate(
		String name,
		String number,
		Date validDate
		) {

}
