package tarefa1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import br.ufal.ic.testingtools.stack.Stack;

public class StackTestTarefa1 {
	
	@Test
	public void testEmptyStack() {
		final int size = 10;
		Stack<Integer> stack = new Stack<Integer>(size);
		assertEquals(true, stack.empty(), "The initial stack is not empty");
	}
	
	@Test
	public void testPush() {
		final int size = 10;
		Stack<Integer> stack = new Stack<Integer>(size);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		
		assertEquals(10, stack.pop().intValue());
		assertEquals(9, stack.pop().intValue());
		assertEquals(8, stack.pop().intValue());
		assertEquals(7, stack.pop().intValue());
		assertEquals(6, stack.pop().intValue());
		assertEquals(5, stack.pop().intValue());
		assertEquals(4, stack.pop().intValue());
		assertEquals(3, stack.pop().intValue());
		assertEquals(2, stack.pop().intValue());
		assertEquals(1, stack.pop().intValue());
	}
	
	@Test
	public void testPushFloat() {
		final int size = 10;
		Stack<Double> stack = new Stack<Double>(size);
		stack.push(1.5);
		stack.push(2.3);
		stack.push(3.6);
		stack.push(4.4);
		stack.push(5.8);
		stack.push(1.5);
		stack.push(2.3);
		stack.push(3.6);
		stack.push(4.4);
		stack.push(5.8);
		
		assertEquals(5.8, stack.pop().doubleValue());
		assertEquals(4.4, stack.pop().doubleValue());
		assertEquals(3.6, stack.pop().doubleValue());
		assertEquals(2.3, stack.pop().doubleValue());
		assertEquals(1.5, stack.pop().doubleValue());
		assertEquals(5.8, stack.pop().doubleValue());
		assertEquals(4.4, stack.pop().doubleValue());
		assertEquals(3.6, stack.pop().doubleValue());
		assertEquals(2.3, stack.pop().doubleValue());
		assertEquals(1.5, stack.pop().doubleValue());
	}
	
	@Test
	public void testPushString() {
		final int size = 10;
		Stack<String> stack = new Stack<String>(size);
		stack.push("test");
		stack.push("software");
		stack.push("hardware");
		stack.push("hello");
		stack.push("world");
		stack.push("hello world");
		stack.push("test");
		stack.push("software");
		stack.push("hardware");
		stack.push("hello");
		
		assertEquals("hello", stack.pop().toString());
		assertEquals("hardware", stack.pop().toString());
		assertEquals("software", stack.pop().toString());
		assertEquals("test", stack.pop().toString());
		assertEquals("hello world", stack.pop().toString());
		assertEquals("world", stack.pop().toString());
		assertEquals("hello", stack.pop().toString());
		assertEquals("hardware", stack.pop().toString());
		assertEquals("software", stack.pop().toString());
		assertEquals("test", stack.pop().toString());
	}
	
	@TestFactory
	Stream<DynamicTest> dynamicTestsPush() {
		final int size = 10;
		Stack<Integer> stack = new Stack<Integer>(size);
		
		for(int i=0; i < size; i++) { 
			stack.push(i);
		}
		
		List<DynamicTest> dynamicTests = new ArrayList<>();
		
		for(int i=9; i >=0; i--) {
			int x = i;
			DynamicTest dynamicTest = DynamicTest.dynamicTest("Pop: "+x, 
					() -> {assertEquals(x,stack.pop().intValue());});
			dynamicTests.add(dynamicTest);
		}
		
		return dynamicTests.stream();
	}
		
	@Test
	public void testPeek() {
		final int size = 5;
		Stack<Integer> stack = new Stack<Integer>(size);
		stack.push(90);
		stack.push(22);
		stack.push(18);
		stack.push(17);
		stack.push(26);
		assertEquals(26, stack.peek().intValue());
		assertEquals(26, stack.peek().intValue());
	}
}
