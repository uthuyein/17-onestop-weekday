package com.jdc.mkt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.DayOfWeek;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnoType {

	int age();
	String[] names();
	DayOfWeek day();
	
	Class<?> type();
	
	MyAnno anno();
	
}
