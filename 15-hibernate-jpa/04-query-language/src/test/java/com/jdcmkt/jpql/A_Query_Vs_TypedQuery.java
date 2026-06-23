package com.jdcmkt.jpql;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.model.Passenger;
import com.jdcmkt.JpaFactory;

public class A_Query_Vs_TypedQuery extends JpaFactory {
	
	@Test
	@Order(2)
	void typedQueryTest() {
		var query = em.createQuery("select p from Passenger p",Passenger.class);
		List<Passenger> list = query.getResultList();		
		System.out.println(list.get(0));
	}

	@Test
	@Order(1)
	@SuppressWarnings("unchecked")
	void queryTest() {
		var query = em.createQuery("select p from Passenger p");
		List<Passenger> list = query.getResultList();		
		System.out.println(list.get(0));
	}
}
