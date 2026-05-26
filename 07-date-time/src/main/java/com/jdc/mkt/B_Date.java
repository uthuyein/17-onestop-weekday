package com.jdc.mkt;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

@SuppressWarnings("unused")
public class B_Date {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
//		humanVsMechine(ldt);
		useTemporalField(ldt);
	}
	
	static void useFluentMethod(LocalDateTime ldt) {
		int year = ldt.getYear();
		System.out.println(year);
	}
	
	static void useTemporalField(LocalDateTime ldt) {
		int year = ldt.get(ChronoField.YEAR);
		System.out.println(year);
	}
	
	static void humanVsMechine(LocalDateTime ldt) {
					
		OffsetDateTime odt = ldt.atOffset(ZoneOffset.ofHoursMinutes(6,30));					
		ZonedDateTime zdt =  ldt.atZone(ZoneId.of("Asia/Tokyo"));
	
//		Human time to MechineTime
		Instant i1 = ldt.toInstant(ZoneOffset.ofHoursMinutes(6, 30));
		Instant i2 = odt.toInstant();
		Instant i3 = zdt.toInstant();

//		Mechine time to Human
		ZonedDateTime zdt1 = i1.atZone(ZoneId.of("Asia/Tokyo"));
		OffsetDateTime odt1 = i2.atOffset(ZoneOffset.ofHoursMinutes(9, 0));
		System.out.println(zdt1);
		System.out.println(odt1);
				
	}
	
	static void useDate() {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate ld1 = LocalDate.of(23, Month.APRIL,20);
		System.out.println(ld1);
	}
}
