package com.jdc.mkt;

import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.model.Address;
import com.jdc.mkt.model.Contact;
import com.jdc.mkt.model.Course;
import com.jdc.mkt.model.Student;

public class StudentTest extends JpaFactory{
	
	@Test
	void testCourse() {
		
		var course = new Course("Java");
		
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(course);
		
		course.setName("Core Java");
		em.getTransaction().commit();
		
	}

	@Test
	@Disabled
	void testStudent() {
		var contact = new Contact("09345353","09375345","andrew@gmail.com");
		var address = new Address("Latha","40st");
		var stu = new Student("Andrew",LocalDate.of(2000, 10, 11));
		stu.setContact(contact);
		stu.setAddress(address);
		
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(stu);
		
		stu.setName("Andrew kaung");
		em.getTransaction().commit();
		
	}
}
