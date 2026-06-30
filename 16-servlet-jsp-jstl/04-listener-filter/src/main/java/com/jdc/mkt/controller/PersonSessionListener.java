package com.jdc.mkt.controller;

import com.jdc.mkt.dto.Person;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

@WebListener
public class PersonSessionListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		var session =  se.getSession();
		var message = "";
		var person = (Person)session.getAttribute("person");
		System.out.println("Person "+person);
		if(null != person) {
			if(person.age() < 18) {
				message = "Not allowed";
			}else {
				message = "Allowed to enter ";
			}
			session.setAttribute("message", message);
		}
	}
	
	
}
