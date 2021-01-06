package com.example.anotattions;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class AssumptionsJUnit5 {
	
	@Test
	public void assumeTrueTest() {
		assumeTrue("hello".equals("hello"), "Não é verdade");
		assertEquals(5, 5, "Sao diferentes");
	}
}
