package com.jdc.mkt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private Integer id;
	
	private String name;
	
	private Double price;
	
	private Size size;
	private Category category;
	
	public enum Size{
		Small,Medium,Large
	}
}
