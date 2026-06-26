package com.jdcmkt.exe;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.model.dto.SelectNameLicenceAndValidDate;
import com.jdcmkt.JpaFactory;

@SuppressWarnings("unchecked")
public class A_Sql_Vs_Jpql extends JpaFactory{
	
	@Test
	@Order(4)
	void selectCarByValidDateWithSql() {
		var sql = """
				select c.brand brand,l.number number,l.validDate  validDate from 
				car_licence_tbl l join car_tbl c on l.car_id = c.id 
				""";
		var query = em.createNativeQuery(sql,SelectNameLicenceAndValidDate.class);
		List<SelectNameLicenceAndValidDate> list = query.getResultList();
		list.forEach(d -> System.out.println(d.name()+"\t"+d.number()+"\t"+d.validDate()));
		
	}
	
	@Test
	@Order(3)
	void selectCarByValidDateWithJpql() {
		var jpql = """
				select new com.jdc.mkt.model.dto.SelectNameLicenceAndValidDate(
				l.car.brand,l.number,l.validDate) from CarLicence l
				""";
		var query = em.createQuery(jpql);
//		query.setParameter("valid", );
		List<SelectNameLicenceAndValidDate>  list = query.getResultList();
		list.forEach(d -> System.out.println(d.name()+"\t"+d.number()+"\t"+d.validDate()));
	}
	
	@Test
	@Order(2)
	void selectDriverByValidDateWithJpql() {
		var jpql = """
				select new com.jdc.mkt.model.dto.SelectNameLicenceAndValidDate(
				l.driver.name name,l.number number,l.validDate  validDate )from 
				DriverLicence l where l.validDate = :valid
				""";
		var query = em.createQuery(jpql,SelectNameLicenceAndValidDate.class);
		query.setParameter("valid", LocalDate.parse("2027-01-01"));
		List<SelectNameLicenceAndValidDate> list = query.getResultList();
		list.forEach(d -> System.out.println(d.name()+"\t"+d.number()+"\t"+d.validDate()));
		
	}

	@Test
	@Order(1)
	void selectDriverByValidDateWithSql() {
		var sql = """
				select d.name name,l.number number,l.validDate  validDate from 
				driver_licence_tbl l join driver_tbl d
				on l.driver_id = d.id 
				where l.validDate = :valid
				""";
		var query = em.createNativeQuery(sql,SelectNameLicenceAndValidDate.class);
		query.setParameter("valid", LocalDate.parse("2027-01-01"));
		List<SelectNameLicenceAndValidDate> list = query.getResultList();
		list.forEach(d -> System.out.println(d.name()+"\t"+d.number()+"\t"+d.validDate()));
		
	}
}
