package com.jdc.mkt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class E_DateTimeFormatter {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		ZonedDateTime ldt = LocalDateTime.now().atZone(ZoneId.of("Asia/Yangon"));

//		localizeFormat(ld, lt, ldt);
//		useISOFormat(ld, lt, ldt);
		customFormat(ld, lt, ldt);
		useFormat();
	}
	
	static void useFormat() {
		LocalDate ld = LocalDate.parse("22:02:1992", DateTimeFormatter.ofPattern("dd:MM:yyyy"));
		System.out.println(ld);
	}
	
	static void customFormat(LocalDate ld, LocalTime lt, ZonedDateTime ldt) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(ld.format(df));
		
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(lt.format(df1));
		
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss z");
		System.out.println(ldt.format(df2));
		
	}
	
	static void localizeFormat(LocalDate ld, LocalTime lt, ZonedDateTime ldt) {
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(ld.format(df));

		DateTimeFormatter df1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(lt.format(df1));

		DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		System.out.println(ldt.format(df2));

	}

	static void useISOFormat(LocalDate ld, LocalTime lt, ZonedDateTime ldt) {

		DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;
		String date = ld.format(df);
		System.out.println(date);

		DateTimeFormatter df1 = DateTimeFormatter.ISO_TIME;
		String time = lt.format(df1);
		System.out.println(time);

		DateTimeFormatter df2 = DateTimeFormatter.ISO_INSTANT;
		String dateTime = ldt.format(df2);
		System.out.println(dateTime);

	}
}
