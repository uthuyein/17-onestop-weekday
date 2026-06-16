package com.jdc.mkt.model.services;

import java.util.List;

import com.jdc.mkt.model.Category;

public class CategoryService  implements DbOperation<Category>{

	@Override
	public int save(Category t) {
		return 0;
	}

	@Override
	public int update(Category t) {
		return 0;
	}

	@Override
	public List<Category> searchBy(Category t) {
		return null;
	}

	@Override
	public Category searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
