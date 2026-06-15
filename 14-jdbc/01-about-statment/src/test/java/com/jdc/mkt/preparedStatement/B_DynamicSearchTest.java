package com.jdc.mkt.preparedStatement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.JunitFactory;

public class B_DynamicSearchTest extends JunitFactory{

	@ParameterizedTest
	@CsvSource({
		"1,,,1",
		",w,,1",
		",,30,2",
		",John,31,1"
	})
	void selectTest(Integer id,String name,Integer age,int size) {
		var list = B_SelectStatement.
				selectBy(id,name,age);
		assertEquals(size, list.size());
	}
}
