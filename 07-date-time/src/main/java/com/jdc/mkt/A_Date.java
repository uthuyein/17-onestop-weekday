package com.jdc.mkt;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("deprecation")
public class A_Date {

	public static void main(String[] args) throws ParseException{
//		useDate();
//		useCalendar();
//		useSimpleDateFormat();
//		usePrdifiedFormatStyle();
		useAddVsRoll();
	}
	
	static void useAddVsRoll() {
		Calendar c = Calendar.getInstance();
		c.set(2022, 07, 22);
		
		c.add(Calendar.MONTH, 7);
		System.out.println(c.getTime());
		
		c.roll(Calendar.DAY_OF_MONTH, 10);
		System.out.println(c.getTime());
		
	}
	
	static void usePrdifiedFormatStyle() {
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG);
		String format = df.format(new Date());
		System.out.println(format);
	}
	
	static void useSimpleDateFormat() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy/dd/MM hh:mm:ss");
		Date d = sdf.parse("2004/20/02 03:20:22");
		
		System.out.println(d);
	}
	
	static void useCalendar() {
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.getTime());
		
		c1.set(2026, 01, 20);
		c1.set(Calendar.MONTH, 1);
		c1.set(Calendar.DAY_OF_MONTH, 30);
		c1.setLenient(true);
		System.out.println(c1.getTime());
		
		int year = c1.get(Calendar.YEAR);
		System.out.println(year);
	}
	
	static void useDate() {
		
		Date d1 = new Date();
		System.out.println(d1);
		
//		internalization,mutable,deprecated,month start from 0,..
		d1.setYear(15);
		d1.setMonth(4);
		d1.setDate(20);
		System.out.println(d1);
	}
}
