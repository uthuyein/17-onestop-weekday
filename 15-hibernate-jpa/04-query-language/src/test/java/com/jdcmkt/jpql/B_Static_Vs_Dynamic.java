package com.jdcmkt.jpql;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.model.Passenger;
import com.jdcmkt.JpaFactory;

public class B_Static_Vs_Dynamic extends JpaFactory{

	@Test
	@Order(1)
	void dyanimcQueryTest() {
		var query = em.createQuery("select p from Passenger p",Passenger.class);
		var list = query.getResultList();
		assertEquals(3, list.size());
	}
	
	@Test
	@Order(2)
	void staticQueryTest() {
		var query = em.createNamedQuery("Passenger.selectAll",Passenger.class);
		var list = query.getResultList();
		assertEquals(3, list.size());
	}
}
