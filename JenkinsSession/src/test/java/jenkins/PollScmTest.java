package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PollScmTest {
	@Test
	public void poll() {
		Reporter.log("Poll Scm class added and executed",true);
	}
}
