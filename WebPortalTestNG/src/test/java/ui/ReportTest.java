package ui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class ReportTest extends BaseTest{
	@Test
	public void reporterTest1() {
		driver.get("https://www.google.com");
		Reporter.log("log1...");
		System.out.println("this is test1...");
		Assert.assertTrue(false);
	}
	
	@Test
	public void reporterTest2() {
		System.out.println("this is test2...");
	}

	@Test
	public void reporterTest3() {
		System.out.println("this is test3...");
	}
}
