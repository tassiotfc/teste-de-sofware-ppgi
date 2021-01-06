package com.example.anotattions;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestJUnit4 {
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { "Hello"}, { "World"}  
           });
    }
    
    private String argument;
    
    public ParameterizedTestJUnit4(String argument){
    	this.argument = argument;
    }

	@Test
	public void testWithStringParameter() {
    	assertNotNull("é nulo", argument);
	}
}
