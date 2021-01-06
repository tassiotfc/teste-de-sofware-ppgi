package com.example.anotattions;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestJUnit5 {
	
	@TestFactory
	Collection<DynamicTest> dynamicTestsFromCollection() {
	    return Arrays.asList(
	        dynamicTest("Primeiro teste", () -> assertTrue(true)),
	        dynamicTest("Segundo teste", () -> assertEquals(4, 2 * 2)),
	        dynamicTest("Terceiro teste", () -> assertNull(null))
	    );
	}
}
