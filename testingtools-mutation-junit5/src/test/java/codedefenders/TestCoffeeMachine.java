package codedefenders;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.junit.Rule;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestCoffeeMachine {
	
    @Test(timeout = 4000)
    public void test() throws Throwable {
        // test here!
    	CoffeeMachine machine = new CoffeeMachine();
    	machine.milkAmount = 100;
    	//exceptionRule.expect(IllegalArgumentException.class);
		//exceptionRule.expectMessage("This just isn't the right amount of coffee!");
		
		try {
			machine.makeLatte(1, 1, 1);
			fail("Test failed");
		}
		catch (IllegalArgumentException e) {
			assertEquals("", "This just isn't the right amount of coffee!", e.getMessage());
		}
		
    }
    
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // test here!
    	CoffeeMachine machine = new CoffeeMachine();
    	machine.waterAmount = 30;
		try {
			machine.makeEspresso(10, 10);
			fail("Test failed");
		}
		catch (IllegalArgumentException e) {
			assertEquals("", "Check the amount of coffee beans and/or water!", e.getMessage());
		}
		
    }
}
