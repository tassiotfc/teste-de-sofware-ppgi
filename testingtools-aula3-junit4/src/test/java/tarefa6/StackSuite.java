package tarefa6;

import org.junit.runner.RunWith;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;

@RunWith(JUnitPlatform.class)
@SelectClasses({StackTest.class, ComputersTest.class})
//@ExcludeTags({"NormalTest", "ExceptionTest"})
public class StackSuite {}
