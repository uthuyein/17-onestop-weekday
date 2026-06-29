package com.jdc.mkt.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
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
	
	private int qty;
	private double total;
	
	@ManyToOne
	@MapsId("salePk")
	@JoinColumns({
		@JoinColumn(name = "vou_num",referencedColumnName = "vou_num"),
		@JoinColumn(name = "customer_id",referencedColumnName = "customer_id"),
		@JoinColumn(name = "sale_date",referencedColumnName = "sale_date"),
	})
	private Sale sales;
	
	
	
}
