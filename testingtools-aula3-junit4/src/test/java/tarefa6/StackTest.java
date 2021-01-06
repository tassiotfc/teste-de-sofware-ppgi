package tarefa6;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import br.ufal.ic.testingtools.stack.OverFlowStackException;
import br.ufal.ic.testingtools.stack.Stack;
import br.ufal.ic.testingtools.stack.UnderflowStackException;

@Tag("DesktopTests")
@Tag("MainFrameTests")
public class StackTest{ 
	
	Stack<Integer> stack;
	
	@BeforeEach
	public void startStack() {
		final int size = 10;
		stack = new Stack<Integer>(size);	
	}
	
	@Test
	@Tag("NormalTest")
	public void testEmptyStack() {
		assertEquals(true, stack.empty(), "The initial stack is not empty");
	}
	
	@Test
	@Tag("NormalTest")
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
	@Tag("NormalTest")
	public void testPeek() {
		stack.push(90);
		stack.push(22);
		stack.push(18);
		stack.push(17);
		stack.push(26);
		assertEquals(26, stack.peek().intValue());
		assertEquals(26, stack.peek().intValue());
	}
	
	@Test
	@Tag("ExceptionTest")
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
	@Tag("ExceptionTest")
	public void testPeekException() {
		Throwable exception = assertThrows(UnderflowStackException.class, () -> stack.peek().intValue());
		assertEquals("Underflow", exception.getMessage());
	}
	
	@Test
	@Tag("ExceptionTest")
	public void testPopException() {
		Throwable exception = assertThrows(UnderflowStackException.class, () -> stack.pop().intValue());
		assertEquals("Underflow", exception.getMessage());
	}
}