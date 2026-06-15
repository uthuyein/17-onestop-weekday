package com.jdc.mkt.preparedStatement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.JunitFactory;
import com.jdc.mkt.Person;

public class C_AutoIncrementTest extends JunitFactory{

	@ParameterizedTest
	@CsvSource({
		"Bolivir,22,4"
	})
	void autoincrementTest(String name,int age,int resId) {
		var id = C_Auto_incrementStatement.insert(new Person(name,age));
		assertEquals(resId, id);
	}
}
