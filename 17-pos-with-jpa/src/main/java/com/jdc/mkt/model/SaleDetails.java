package com.jdc.mkt.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sale_details_tbl")
public class SaleDetails {
	
	@EmbeddedId
	private SaleDetailPk id;

	@ManyToOne
	@MapsId("productId")
	private Product product;
	@ManyToOne
	private Sale sales;
	private int qty;
	private double total;
	
}
