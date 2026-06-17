package com.jdc.mkt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.fields.E_ColumnMapping.Member;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {

	static EntityManagerFactory emf;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("class-and-field-mappings");
	}
	
	@Test
	void test() {
		System.out.println(Member.Silver.ordinal());
		
	}
}
