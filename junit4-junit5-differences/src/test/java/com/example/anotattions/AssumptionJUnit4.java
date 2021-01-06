package com.example.anotattions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class AssumptionJUnit4 {
	
	@Test
	public void assumeTrueTest() {
		assumeTrue("Não é verdade", "hello".equals("hello"));
		assertEquals("Sao diferentes", 5, 5);
	} 
}
