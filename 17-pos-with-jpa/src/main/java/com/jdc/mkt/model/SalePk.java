package com.jdc.mkt.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class SalePk implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String vouNum;
	
	@Column(name = "customer_id")
	private int customerId;
}
