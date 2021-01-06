package com.example.anotattions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.junit.rules.ExpectedException;

public class AssertionsTestJUnit5 {

	@Test
	@RepeatedTest(5)
	public void igualdade() {
		assertEquals(1, 1, "Não são iguals");
	}
	
	@Test
	public void somaVetor1() {
		int[] vetor = new int[2];
		assertThrows(IndexOutOfBoundsException.class, () -> {
			Integer.sum(vetor[1], vetor[2]);});
	}
	
	@Test
	public void somaVetor2() {
		int[] vetor = new int[2];
		
		Throwable throwable = assertThrows(IndexOutOfBoundsException.class, () -> {
			Integer.sum(vetor[1], vetor[2]);});
		assertEquals("2", throwable.getMessage());
	}
}
