package tarefa6;



import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import br.ufal.ic.testingtools.stack.Stack;

public class ComputersTest {
	
	@Test
	@Timeout(value = 50, unit = TimeUnit.MILLISECONDS)
	@Tag("MainFrameTests")
	@Tag("NormalTest")
	public void testTimeRestrictionMainFrame() {
		Stack<Integer> myOtherStack = new Stack<Integer>(900000);
		for (int i = 0; i < 900000; i++) {
			myOtherStack.push(i);
		}
	}
	
	@Test
	@Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
	@Tag("DesktopTests")
	@Tag("NormalTest")
	public void testTimeRestrictionDesktop() {
		Stack<Integer> myOtherStack = new Stack<Integer>(1000000);
		for (int i = 0; i < 1000000; i++) {
			myOtherStack.push(i);
		}
	}
	
}
