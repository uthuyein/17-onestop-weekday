package com.jdc.mkt.model;

import java.io.Serializable;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Data
@Embeddable
public class SaleDetailPk implements Serializable {

	private static final long serialVersionUID = 1L;

	@Embedded
	private SalePk salePk;
	
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(columnDefinition = "time default(current_time)")
	private LocalTime saleTime;
	
	
}
