package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.TestUtils;

public class Listeners extends TestUtils implements ITestListener {
		
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is - "+result.getName());
		System.out.println("test starting...");
		System.setProperty("org.uncommons.reportng.title", "houdaf report");
	}
	
	public void onTestFailure(ITestResult result) {
		Reporter.log("Execution status is - "+result.getStatus());
		System.out.println("test failed... screenshot captured");
		try {
			getScreenshot();
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			Reporter.log("<a href=\"C:\\Users\\mehdi\\git\\WebPortalTestNG\\WebPortalTestNG\\screenshots\\screenThu-Oct-15-23-21-19-WEST-2020.png\">Test result..</a>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
