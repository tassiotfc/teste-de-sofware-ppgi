package com.example.anotattions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Exemplo: Nested")
public class NestedTest {
	@Test
    @DisplayName("Exemplo de teste do método init")
    void sampleTestForMethodInit() {
		System.out.println("Init");
    }
	 	 
	@Nested
	@DisplayName("Testes para o método A")
	class A {
		@Test
	    @DisplayName("Exemplo de teste para o método A")
	    void sampleTestForMethodA() {
			System.out.println("A");
	    }
	 
		@Nested
	    @DisplayName("Testes para o método B")
	    class WhenX {
			@Test
	        @DisplayName("Exemplo de teste para o método B")
	        void sampleTestForMethodAWhenX() {
				System.out.println("B");
	        }
	    }
	}
}
