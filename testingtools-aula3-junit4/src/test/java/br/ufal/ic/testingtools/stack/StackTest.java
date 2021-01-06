package br.ufal.ic.testingtools.stack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({DesktopTests.class, MainFrameTests.class})
public class StackTest {
		
	@Test
	public void testEmptyStack() {
		final int size = 10;
		Stack<Integer> stack = new Stack<Integer>(size);
		assertEquals("The initial stack is not empty", true, stack.empty());
	}
	
	@Test
	public void testPush() {
		final int size = 10;
		Stack<Integer> stack = new Stack<Integer>(size);
		stack.push(90);
		stack.push(22); 
		stack.push(18);
		assertEquals(18, stack.pop().intValue());
		assertEquals(22, stack.pop().intValue());
		assertEquals(90, stack.pop().intValue());
	}
	
}
