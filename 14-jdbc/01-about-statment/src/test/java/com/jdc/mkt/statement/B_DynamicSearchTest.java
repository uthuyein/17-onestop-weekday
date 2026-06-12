package com.jdc.mkt.statement;

import static com.jdc.mkt.statement.C_Reference_Satement.selectBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class B_DynamicSearchTest {

	@ParameterizedTest
	@CsvSource(delimiter = ',',value ={
		"1,,",
		",j,",
		",,20",
		"2,wi,20"
	})
	void searchBy(Integer id,String name,Integer age) {
		var list = selectBy(id, name, age);
		System.out.println(list);
	}
}
