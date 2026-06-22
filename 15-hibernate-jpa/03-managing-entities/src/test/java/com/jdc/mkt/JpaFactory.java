package com.jdc.mkt;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.mkt.model.Contact;
import com.jdc.mkt.model.Department;
import com.jdc.mkt.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@TestMethodOrder(OrderAnnotation.class)
public class JpaFactory {

	static EntityManagerFactory emf;
	EntityManager em;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("managing-entities");
	}
	
	@BeforeEach
	void createEm() {
		em = emf.createEntityManager();
	}
	
	@AfterEach
	void closeEm() {
		if(null != em && em.isOpen())
			em.close();
	}
	
	@AfterAll
	static void closeEmf() {
		if(null != emf && emf.isOpen())
			emf.close();
	}
	
	 Employee getEmployee() {
		var cont = new Contact("098888645","097773453");
		var dep = new Department();
		dep.setName("services");
		var emp = new Employee();
		emp.setName("Arnel");
		
		emp.addContact(cont);
		
		emp.setDepartment(dep);
		
		return emp;
	}
}
