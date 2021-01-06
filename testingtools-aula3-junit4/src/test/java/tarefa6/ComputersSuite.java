package tarefa6;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeTags({"DesktopTests", "MainFrameTests"})
//@ExcludeTags({"NormalTest", "ExceptionTest"})
@SelectClasses({StackTest.class, ComputersTest.class})
public class ComputersSuite { }
