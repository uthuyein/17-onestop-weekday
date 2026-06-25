package com.jdc.mkt.model;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class Licence {

	@Id
	private String number;
	private Date issueDate;
	private Date validDate;
}
