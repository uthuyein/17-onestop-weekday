package com.jdc.mkt.statement;

import static com.jdc.mkt.statement.C_Reference_Satement.selectBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class B_DynamicSearchTest {

	@ParameterizedTest
	@CsvSource(delimiter = ',',value ={
		"2,,,1",
		",j,,2",
		",,25,3",
		"2,wi,25,1",
		",,,3"
	})
	void searchBy(Integer id,String name,Integer age,Integer result) {
		var list = selectBy(id, name, age);
		assertEquals(result, list.size());
	}
}
