package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class CalculatorTest {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}
	
	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
	
	@ParameterizedTest(name = "{0} * {1} = {2}")
	@CsvSource({
			"0,    1,   0",
			"1,    2,   2",
			"5,	   5,   25",
			"1,  100,   100"
	})
	void multiply(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.multiply(first, second),
				() -> first + " * " + second + " should equal " + expectedResult);
	}
	
	@ParameterizedTest(name = "{0} = {1}")
	@CsvSource({
			"-1,   1",
			"1,    1",
			"5,	   5",
			"-25,  25"
	})
	void module(int first, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.module(first),
				() -> first + " should equal " + expectedResult);
	}
}
