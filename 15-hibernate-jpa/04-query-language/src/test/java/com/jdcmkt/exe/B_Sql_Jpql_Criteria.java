package com.jdcmkt.exe;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.model.dto.SelectDNameDNumberTownshipStreetClNumerCModel;
import com.jdcmkt.JpaFactory;

@SuppressWarnings("unchecked")
public class B_Sql_Jpql_Criteria extends JpaFactory{

//	select driver info(name,nrc,address) by car licence?
	
	@Test
	@Order(1)
	void selectWithSql() {
		var sql = """
				select d.name,dl.number,ad.township,ad.street,cl.number,c.model from car_tbl c
				join car_licence_tbl cl on cl.car_id = c.id 
				join trip_detail_tbl tdt on tdt.car_licence_id = cl.number 
				join driver_licence_tbl dl on tdt.driver_licence_id = dl.number 
				join driver_tbl d on d.id = dl.driver_id 
				join address_tbl ad on d.address_id = ad.id 
				where cl.number = :clNumber
				
				""";
		var query = em.createNativeQuery(sql,SelectDNameDNumberTownshipStreetClNumerCModel.class);
		query.setParameter("clNumber", "MDY-7B-5678");
		var stream = query.getResultStream().map(obj -> (SelectDNameDNumberTownshipStreetClNumerCModel)obj);
		System.out.println(stream.findFirst().orElse("There is no driver"));
		
	}
	
}
