package com.jdc.mkt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,
	ElementType.PARAMETER,
	ElementType.CONSTRUCTOR,
	ElementType.METHOD,
	ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatAnno.class)
public @interface MyAnno {

//	Method name will be element name
//	Return type will be elment type
//  when method name value() , element name no need to declare
	String value() default "No name";
	
	int age() default 1;
	
	
}








