package com.jdcmkt.jpql;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.model.Address;
import com.jdc.mkt.model.Car;
import com.jdc.mkt.model.Driver;
import com.jdcmkt.JpaFactory;

public class G_Custom_Join extends JpaFactory{
	
	
	@Test
//	@Disabled
	@Order(3)
	void manyTest() {
		var join = "select ad from Address ad left join ad.drivers d where d.name = :name";
		var query = em.createQuery(join,Address.class);
		query.setParameter("name", "David Brown");
		var list = query.getResultList();
		
	}
	
	@Test
	@Disabled
	@Order(2)
	void oneTest() {
		var join = "select d from Driver d inner join d.address ad";
		var query = em.createQuery(join,Driver.class);
		var list = query.getResultList();
	}

	@Test
	@Disabled
	@Order(1)
	void singleFieldTest() {
		var withoutJoin = "select c from CarLicence c";
		var withJoin = "select c from Car c  where c.carLicence.number = :num";
		
		var query = em.createQuery(withJoin,Car.class);
		query.setParameter("num", "YGN-5A-1234");
		var list = query.getResultList();
//		list.forEach(cl -> System.out.println(cl.getNumber()+"\t"+cl.getCar().getBrand()));
	}
}
