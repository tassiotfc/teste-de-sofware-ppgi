package tarefacobertura;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.ufal.ic.testingtools.search.BinarySearch;

public class BinarySearchTestTarefa8 {
	
	@Test
	public void binarySearchTestImpar() { 
		int[] elements = {1, 2, 3, 4, 5};
		BinarySearch binarySearch = new BinarySearch();
		assertAll(
				() -> assertThat(0, is(binarySearch.binarySearch(elements, 1))),
				() -> assertThat(1, is(binarySearch.binarySearch(elements, 2))),
				() -> assertThat(2, is(binarySearch.binarySearch(elements, 3))),
				() -> assertThat(3, is(binarySearch.binarySearch(elements, 4))),
				() -> assertThat(4, is(binarySearch.binarySearch(elements, 5))),
				() -> assertThat(-1, is(binarySearch.binarySearch(elements, 6)))
		);
	}
	
	@Test
	public void binarySearchTestImparRepeticao() { 
		int[] elements = {1, 2, 3, 5, 5};
		BinarySearch binarySearch = new BinarySearch();
		
		assertAll(
				() -> assertThat(0, is(binarySearch.binarySearch(elements, 1))),
				() -> assertThat(1, is(binarySearch.binarySearch(elements, 2))),
				() -> assertThat(2, is(binarySearch.binarySearch(elements, 3))),
				() -> assertEquals(true, binarySearch.binarySearch(elements, 5) == 3 || 
				   						 binarySearch.binarySearch(elements, 5) == 4),
				() -> assertThat(-1, is(binarySearch.binarySearch(elements, 6)))
		);
	}
	
	@Test
	public void binarySearchTestPar() {
		int[] elements = {1, 2, 3, 4, 5, 6};
		BinarySearch binarySearch = new BinarySearch();
		
		assertAll(
				() -> assertThat(0, is(binarySearch.binarySearch(elements, 1))),
				() -> assertThat(1, is(binarySearch.binarySearch(elements, 2))),
				() -> assertThat(2, is(binarySearch.binarySearch(elements, 3))),
				() -> assertThat(3, is(binarySearch.binarySearch(elements, 4))),
				() -> assertThat(4, is(binarySearch.binarySearch(elements, 5))),
				() -> assertThat(5, is(binarySearch.binarySearch(elements, 6))),
				() -> assertThat(-1, is(binarySearch.binarySearch(elements, 7)))
		);
	}
	
	@Test
	public void binarySearchTestParRepeticao() {
		int[] elements = {1, 1, 3, 4, 6, 7};
		BinarySearch binarySearch = new BinarySearch();
		
		assertAll(
				() -> assertEquals(true, binarySearch.binarySearch(elements, 1) == 0 || 
						   				 binarySearch.binarySearch(elements, 1) == 1),
				() -> assertThat(2, is(binarySearch.binarySearch(elements, 3))),
				() -> assertThat(3, is(binarySearch.binarySearch(elements, 4))),
				() -> assertThat(4, is(binarySearch.binarySearch(elements, 6))),
				() -> assertThat(5, is(binarySearch.binarySearch(elements, 7))),
				() -> assertThat(-1, is(binarySearch.binarySearch(elements, 2)))
		);
	}
	
	@Test
	public void binarySearchTestVazio() {
		int[] elements = {};
		BinarySearch binarySearch = new BinarySearch();
		
		assertEquals(-1, binarySearch.binarySearch(elements, 2));
	}
}
