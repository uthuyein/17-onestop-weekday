package com.jdc.mkt.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="sale_tbl")
public class Sale {

	@EmbeddedId
	private SalePk id;
	
	@ManyToOne
	@MapsId("customerId")
	private Customer customer;
	
	@Column(columnDefinition = "date default(current_date)")
	private LocalDate saleDate;
	
	@Column(columnDefinition = "date default(current_time)")
	private LocalTime saleTime;
	
	private Double subTotal;
	private Double discount;
	private Double total;
	@Column(columnDefinition = "tinyint(1) not null default 0")
	private Boolean isDelete;
	
	
	
}







