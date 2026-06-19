package com.jdc.mkt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.converter.Lottery;
import com.jdc.mkt.inheritance.Student;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {

	static EntityManagerFactory emf;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("class-and-field-mappings");
	}
	
	@Test
	void testConverter() {
		var em = emf.createEntityManager();
		var con = new Lottery();
		con.setNumber(54);
		con.setDigit(6);
		
		em.getTransaction().begin();
			em.persist(con);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	@Test
	@Disabled
	void test() {
		var em = emf.createEntityManager();
		var acc = new Student();
		
		acc.add("Watch movie","Reading","play games");
		
		acc.setName("Sandi");
		acc.setLoginId("ssstyr");
		acc.setPassword("123rty");
		
		em.getTransaction().begin();
			em.persist(acc);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
