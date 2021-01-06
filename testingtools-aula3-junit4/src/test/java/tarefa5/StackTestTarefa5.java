package tarefa5;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufal.ic.testingtools.stack.OverFlowStackException;
import br.ufal.ic.testingtools.stack.Stack;
import br.ufal.ic.testingtools.stack.UnderflowStackException;

public class StackTestTarefa5 { 
	
	Stack<Integer> stack;
	
	@BeforeEach
	public void startStack() {
		final int size = 10;
		stack = new Stack<Integer>(size);	
	}
	
	@Test
	public void testEmptyStack() {
		assertThat(true, is(stack.empty()));
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
		
		assertThat(10, is(stack.pop().intValue()));
		assertThat(9, is(stack.pop().intValue()));
		assertThat(8, is(stack.pop().intValue()));
		assertThat(7, is(stack.pop().intValue()));
		assertThat(6, is(stack.pop().intValue()));
		assertThat(5, is(stack.pop().intValue()));
		assertThat(4, is(stack.pop().intValue()));
		assertThat(3, is(stack.pop().intValue()));
		assertThat(2, is(stack.pop().intValue()));
		assertThat(1, is(stack.pop().intValue()));
	}
	
	@Test
	public void testPeek() {
		stack.push(90);
		stack.push(22);
		stack.push(18);
		stack.push(17);
		stack.push(26);
		assertThat(26, is(stack.peek().intValue()));
		assertThat(26, is(stack.peek().intValue()));
	}
	
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
	
	@Test
	public void testPopException() {
		Throwable exception = assertThrows(UnderflowStackException.class, () -> stack.pop().intValue());
		assertEquals("Underflow", exception.getMessage());
	}
}