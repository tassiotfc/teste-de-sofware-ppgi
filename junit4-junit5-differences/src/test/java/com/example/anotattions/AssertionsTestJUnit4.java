package com.example.anotattions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AssertionsTestJUnit4 {
	@Test
	public void igualdade() {
		assertEquals("Não são iguals", 1, 1);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void somaVetor1() {
		int[] vetor = new int[2];
		Integer.sum(vetor[1], vetor[2]);
	}
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void somaVetor2() {
		int[] vetor = new int[2];
		
		exceptionRule.expect(IndexOutOfBoundsException.class);
		exceptionRule.expectMessage("2");
		Integer.sum(vetor[1], vetor[2]);
	}
}

