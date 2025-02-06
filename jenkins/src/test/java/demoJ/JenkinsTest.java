package demoJ;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
@Test
public void simple() {
	Reporter.log("success",true);
}
}
