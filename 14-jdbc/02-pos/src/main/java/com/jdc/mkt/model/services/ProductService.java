package com.jdc.mkt.model.services;

import java.util.List;

import com.jdc.mkt.model.Product;

public class ProductService implements DbOperation<Product> {

	@Override
	public int save(Product t) {
		return 0;
	}

	@Override
	public int update(Product t) {
		return 0;
	}

	@Override
	public List<Product> searchBy(Product t) {
		return null;
	}

}
