package com.jdcmkt.criteria;

import java.time.LocalDate;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.model.DriverLicence;
import com.jdc.mkt.model.DriverLicence_;
import com.jdc.mkt.model.Driver_;
import com.jdc.mkt.model.dto.SelectNameLicenceAndValidDate;
import com.jdcmkt.JpaFactory;

import jakarta.persistence.criteria.JoinType;

public class B_Join_Query extends JpaFactory{

	@Test
	@Order(1)
	void useSingleField() {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(SelectNameLicenceAndValidDate.class);
		var root = cq.from(DriverLicence.class);
		
//		Join
		var driver = root.join(DriverLicence_.driver,JoinType.LEFT);
		
//		Projection
		cq.multiselect(
//				without join driver
//				root.get(DriverLicence_.driver).get(Driver_.name),
//				With Join
				driver.get(Driver_.name),
				root.get(DriverLicence_.number),
				root.get(DriverLicence_.validDate)
				);
		
//		Predicate
		cq.where(cb.equal(
					root.get(DriverLicence_.validDate),
					LocalDate.parse("2028-02-15") ));
		
		var query = em.createQuery(cq);
		var list = query.getResultList();
		list.forEach(s -> System.out.println(s.name()));
	}
}
