package com.jdc.mkt.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class SalePk implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "vou_num")
	private String vouNum;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "sale_date", columnDefinition = "date default(current_date)")
	private LocalDate saleDate;
	
}
