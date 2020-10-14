package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	//3 ways to skip a test
	
	boolean isSkipped = true;
	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("This test must be skipped...");
	}
	
	@Test
	public void skipTest2() {
		System.out.println("This test must be forcefully skipped... (test2)");
		throw new SkipException("the test is skipped...");
	}
	
	@Test
	public void skipTest3() {
		if(isSkipped == false) {
			System.out.println("This test isn't skipped...");
		} else {
			System.out.println("This test must be forcefully skipped... (test3)");
			throw new SkipException("the test is skipped...");
		}
		
	}
}
