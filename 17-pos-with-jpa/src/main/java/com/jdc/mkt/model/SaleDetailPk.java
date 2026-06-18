package com.jdc.mkt.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class SaleDetailPk implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "vou_num")
	private String vouNum;
	
	@Column(name = "customer_id")
	private int customerId;
}
