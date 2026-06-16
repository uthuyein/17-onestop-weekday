package com.jdc.mkt.model.services;

import java.util.List;

public interface DbOperation<T> {

	int save(T t);
	int update(T t);
	List<T> searchBy(T t);
}
