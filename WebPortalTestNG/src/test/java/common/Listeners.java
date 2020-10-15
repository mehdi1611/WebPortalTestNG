package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.TestUtils;

public class Listeners extends TestUtils implements ITestListener {
		
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test starting...");
	}
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test failed... screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
