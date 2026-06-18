package com.jdc.mkt.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class SaleDetailPk implements Serializable {

	private static final long serialVersionUID = 1L;

	private SalePk id;
	
	@Column(name = "customer_id")
	private int customerId;
}
