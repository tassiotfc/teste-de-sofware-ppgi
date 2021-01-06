package tarefacobertura;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufal.ic.testingtools.stack.OverFlowStackException;
import br.ufal.ic.testingtools.stack.Stack;
import br.ufal.ic.testingtools.stack.UnderflowStackException;

public class StackTestTarefa8 {
	
	Stack<Integer> stack;
	
	@BeforeEach
	public void startStack() {
		final int size = 10;
		stack = new Stack<Integer>(size);	
	}
	
	
	@Test
	public void testLengthStack() {
		Stack<Integer> stack1;
		final int size = 10;
		stack1 = new Stack<Integer>(size);
		assertEquals(10, stack1.size(), "The length stack is not 10");
	}
	
	@Test
	public void testEmptyStack() {
		assertEquals(true, stack.empty(), "The initial stack is not empty");
	}
	
	@Test
	public void testPush() {
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

		assertAll(
				() -> assertEquals(10, stack.pop().intValue()),
				() -> assertEquals(9, stack.pop().intValue()),
				() -> assertEquals(8, stack.pop().intValue()),
				() -> assertEquals(7, stack.pop().intValue()),
				() -> assertEquals(6, stack.pop().intValue()),
				() -> assertEquals(5, stack.pop().intValue()),
				() -> assertEquals(4, stack.pop().intValue()),
				() -> assertEquals(3, stack.pop().intValue()),
				() -> assertEquals(2, stack.pop().intValue()),
				() -> assertEquals(1, stack.pop().intValue())
		);
		
	}
	
	/*
	@Test
	public void testPeek() {
		stack.push(90);
		stack.push(22);
		stack.push(18);
		stack.push(17);
		stack.push(26);
		assertAll(
				() -> assertEquals(26, stack.peek().intValue()),
				() -> assertEquals(26, stack.peek().intValue())
		);
		
	}*/
	
	@Test
	public void testPushException() {
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
		Throwable exception = assertThrows(OverFlowStackException.class, () -> stack.push(15));
		assertEquals("Overflow", exception.getMessage());
	}
	
	@Test
	public void testPeekException() {
		Throwable exception = assertThrows(UnderflowStackException.class, () -> stack.peek().intValue());
		assertEquals("Underflow", exception.getMessage());
	}
	/*
	@Test
	public void testPopException() {
		Throwable exception = assertThrows(UnderflowStackException.class, () -> stack.pop().intValue());
		assertEquals("Underflow", exception.getMessage());
	}*/
}
