package com.jdc.mkt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {

	private int id;
	@NonNull
	private String name;
	@NonNull
	private Double price;
	@NonNull
	private Size size;
	private Category category;
	
	public enum Size{
		Small,Medium,Large
	}
}
