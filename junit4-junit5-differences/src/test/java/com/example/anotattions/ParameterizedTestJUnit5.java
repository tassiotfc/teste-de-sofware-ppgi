package com.example.anotattions;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestJUnit5 {
	
	@ParameterizedTest
	@ValueSource(strings = { "Hello", "World"})
	void testWithStringParameter(String argument) {
	    assertNotNull(argument, "é nulo");
	}
}
