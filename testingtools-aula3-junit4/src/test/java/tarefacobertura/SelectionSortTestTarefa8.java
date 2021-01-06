package tarefacobertura;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hamcrest.number.OrderingComparison;
import org.junit.jupiter.api.Test;

import br.ufal.ic.testingtools.search.BinarySearch;
import br.ufal.ic.testingtools.sort.SelectionSort;
import br.ufal.ic.testingtools.sort.Sort;

public class SelectionSortTestTarefa8 {
	
	@Test
	public void selectionSortTestTamanho() { 
		int[] elements = {1, 2, 3, 4, 5, 6};
		Sort sortTest = new SelectionSort();
		
		sortTest.sort(elements);
		
		assertThat(6, is(elements.length));
	}
	
	@Test
	public void selectionSortTestDesordenado() {
		int[] elements = {6, 5, 4, 3, 2, 1};
		Sort sortTest = new SelectionSort();
		
		sortTest.sort(elements);
		
		for (int i = 0; i < elements.length - 1; ++i) {
			assertThat(elements[i], is(OrderingComparison.lessThanOrEqualTo(elements[i + 1])));
		} 
	}
	
	@Test
	public void selectionSortTestOrdenado() {
		int[] elements = {1, 2, 3, 4, 5, 6};
		Sort sortTest = new SelectionSort();
		
		sortTest.sort(elements);
		
		for (int i = 0; i < elements.length - 1; ++i) {
			assertThat(elements[i], is(OrderingComparison.lessThanOrEqualTo(elements[i + 1])));
		} 
	}
	
	@Test
	public void selectionSortTestDesordenadoValoresFinais() {
		int[] elements = {6, 5, 4, 3, 2, 1};
		Sort sortTest = new SelectionSort();
		
		sortTest.sort(elements);
		
		assertAll(
				() ->	assertEquals(1, elements[0]),
				() ->	assertEquals(2, elements[1]),
				() ->	assertEquals(3, elements[2]),
				() ->	assertEquals(4, elements[3]),
				() ->	assertEquals(5, elements[4]),
				() -> assertEquals(6, elements[5])
		);
	}
	
	@Test
	public void selectionSortTestValoresOrdenadoValoresFinais() {
		int[] elements = {1, 2, 3, 4, 5, 6};
		Sort sortTest = new SelectionSort();
		
		sortTest.sort(elements);
		
		assertAll(
				() ->	assertEquals(1, elements[0]),
				() ->	assertEquals(2, elements[1]),
				() ->	assertEquals(3, elements[2]),
				() ->	assertEquals(4, elements[3]),
				() ->	assertEquals(5, elements[4]),
				() -> assertEquals(6, elements[5])
		);
	}
}
