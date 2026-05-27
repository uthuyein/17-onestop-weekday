package com.jdc.mkt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class D_TemporalAmount {

	public static void main(String[] args) {
//		usePeriod();
		useDuration();
	}

	static void usePeriod() {
		LocalDate ld = LocalDate.now();
		Period p = Period.between(ld, LocalDate.of(2026, 05, 31));
		System.out.println(p.getDays());

		Period p1 = Period.ofMonths(2);
		LocalDate ld1 = ld.plus(p1);
		System.out.println(ld1);

		Period p2 = Period.parse("P1Y2M3D");
		LocalDate ld2 = ld.minus(p2);
		System.out.println(ld2);
		
		Period p3 = Period.from(p2);
		LocalDate ld4 = ld.plus(p3);
		System.out.println(ld4);
	}

	static void useDuration() {
		LocalTime lt = LocalTime.now();
//		Runtime exception will occour when use localdate of method in duration between
		Duration d1 = Duration.between(lt, LocalTime.of(12, 20));
		System.out.println(d1.toHours()+"\t"+d1.toMillis());
		
		Duration d2 = Duration.ofDays(20);
		System.out.println(d2.toHours());
	}
}
