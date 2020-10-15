package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;
import common.Retry;

public class ListenerDemoTest extends BaseTest{

	@Test(retryAnalyzer = Retry.class)
	public void launchApp() {
		driver.get("https://ebay.com");
		Assert.assertTrue(false);
	}
}
