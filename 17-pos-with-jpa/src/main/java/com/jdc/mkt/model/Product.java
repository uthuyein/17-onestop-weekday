package com.jdc.mkt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product_tbl")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false,length = 45)
	private String name;
	
	private Double price;
	
	@Enumerated(EnumType.STRING)
	private Size size;
	
	@Column(columnDefinition = "tinyint(1) default 0")
	private boolean isDelete;
	
	@ManyToOne
	private Category category;
	
	public enum Size{
		Small,Medium,Large
	}
}
