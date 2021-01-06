package tarefa4;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import br.ufal.ic.testingtools.sort.QuickSort;
import br.ufal.ic.testingtools.sort.Sort;

public class SortTestTarefa4 {
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	public void testSort() {
		final int elementsSize = 1000000; 
		int[] elements = new int[elementsSize]; 
		Random generator = new Random();
		Sort sortTest = new QuickSort(); 
		
		for (int i = 0; i < elementsSize; ++i) {
			elements[i] = generator.nextInt();
		}
		
		sortTest.sort(elements);
		
		for (int i = 0; i < elements.length - 1; ++i) {
			assertTrue(elements[i] <= elements[i + 1], "Element is not smaller");
		} 
		
	}
	
}
