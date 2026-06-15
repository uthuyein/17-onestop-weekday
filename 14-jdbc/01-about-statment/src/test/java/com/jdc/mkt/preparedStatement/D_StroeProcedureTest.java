package com.jdc.mkt.preparedStatement;

import static com.jdc.mkt.preparedStatement.D_StoreProcedure.createProcedure;
import static com.jdc.mkt.preparedStatement.D_StoreProcedure.getNames;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class D_StroeProcedureTest {

//	@BeforeAll
	static void init() {
		createProcedure();
	}
	
	@ParameterizedTest
	@CsvSource({"w,1"})
	void selectNameTest(String name,int size) {
		var list = getNames("w");
		System.out.println(list);
		assertEquals(size, list.size());
	}
}
