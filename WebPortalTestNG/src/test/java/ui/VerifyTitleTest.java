package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VerifyTitleTest {
	static WebDriver driver;
	@Test
	public void titleTest() {
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		System.out.println("test");
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@BeforeTest
	public void bfTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	
	@AfterTest
	public void aftTest() {
		driver.quit();
	}
	
}
