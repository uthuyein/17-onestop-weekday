package com.jdcmkt.jpql;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.model.Address;
import com.jdc.mkt.model.CarLicence;
import com.jdc.mkt.model.TripDetail;
import com.jdc.mkt.model.TripDetailPk;
import com.jdcmkt.JpaFactory;

@SuppressWarnings("unused")
public class F_Default_Join extends JpaFactory{
	
	@Test
	@Order(3)
	void addressTest() {
		var address = em.find(Address.class, 1);
		
	}
	
	@Test
	@Disabled
	@Order(2)
	void manyToOneTest() {
		var pk = new TripDetailPk();
		pk.setCarLicenceId("YGN-5A-1234");
		pk.setDriverLicenceId("DL-10001");
		pk.setPassengerId(1);
		pk.setTripId(1);
			
		var detail = em.find(TripDetail.class,pk );
	}

	@Test
	@Disabled
	@Order(1)
	void oneToOneTest() {
		var lic = em.find(CarLicence.class, "YGN-5A-1234");
		var car = lic.getCar();
		System.out.println(car.getBrand()+"\t"+car.getModel());
	}
}
