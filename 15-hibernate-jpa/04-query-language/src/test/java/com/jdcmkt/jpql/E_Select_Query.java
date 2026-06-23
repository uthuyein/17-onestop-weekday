package com.jdcmkt.jpql;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.model.Driver;
import com.jdc.mkt.model.DriverLicence;
import com.jdcmkt.JpaFactory;

public class E_Select_Query extends JpaFactory{

	@Test
	@Order(2)
	void useIn() {
		var query = em.createQuery("""
				select d from DriverLicence d where d.licenceType in ('A','C')
				""",DriverLicence.class);
		
		var list = query.getResultList();
		assertEquals(1, list.size());
	}
	
	@Test
	@Order(2)
	void useIsNull() {
		var query = em.createQuery("""
				select d from Driver d where d.address is null
				""",Driver.class);
		
		var list = query.getResultList();
		assertEquals(1, list.size());
	}
	
	@Test
	@Order(1)
	void useBetween() {
		var query = em.createQuery("""
				select d from Driver d where d.dob between :from and :to
				""",Driver.class);
		query.setParameter("from", LocalDate.parse("1985-05-10"));
		query.setParameter("to",LocalDate.parse( "1990-08-20"));
		
		var list = query.getResultList();
		assertEquals(2, list.size());
	}
}
