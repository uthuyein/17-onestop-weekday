package com.jdc.mkt.relations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Barcode {

	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Product product;
}
