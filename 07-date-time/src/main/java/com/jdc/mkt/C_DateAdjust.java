package com.jdc.mkt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;

public class C_DateAdjust {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		useFluent(ldt);
	}
	
	static void useFluent(LocalDateTime ldt) {
		LocalDateTime ldt1 = ldt.withYear(2020);
		System.out.println(ldt1);
		
		LocalDateTime ldt2 = ldt.plusMonths(3);
		System.out.println(ldt2);
		
		LocalDateTime ldt3 = ldt.minusDays(3);
		System.out.println(ldt3);
		
	}
	
	static void useWithPlusMinus(LocalDateTime ldt) {
//		TemporalAdjuster with
		LocalDateTime with1 = ldt.with(LocalDate.of(2020, 04, 20));
		System.out.println(with1);
		
//		TemporalField with
		LocalDateTime with2 = ldt.with(ChronoField.MONTH_OF_YEAR,3);
		System.out.println(with2);
		
//		TemporalAmount Plus minus
		LocalDateTime plus = ldt.plus(Period.ofDays(2));
		System.out.println(plus);
		
		LocalDateTime minus = ldt.minus(Duration.ofHours(2));
		System.out.println(minus);
	}
}
