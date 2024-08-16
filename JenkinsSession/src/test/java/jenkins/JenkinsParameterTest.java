package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsParameterTest {
	@Test
	public void recieveParamegter() {
		String browserValue = System.getProperty("Browser");
		Reporter.log(browserValue,true);
	}
}
