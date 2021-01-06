package br.ufal.ic.testingtools.search;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	
	@Test
	public void binarySearchTest() { 
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
}