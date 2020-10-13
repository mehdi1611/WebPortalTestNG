package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VerifyTitleAndTextTest {
	static WebDriver driver;
	static SoftAssert softAsrt = new SoftAssert();
	@Test
	public void titleTest() {
		String expectedTitle = "Eslectronics, Cars, Fashion, Collectibles & More | eBay";
		System.out.println("test");
		String actualTitle = driver.getTitle();
		softAsrt.assertEquals(actualTitle, expectedTitle, "The title isn't correct....");
	}
	
	@Test
	public void buttonTest() {
		WebElement btnSearch = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
		String expectedText  = "Search";
		String ActualText	 = btnSearch.getAttribute("value");
		softAsrt.assertEquals(ActualText, expectedText, "the text in the button is not good....");
	}
	
	@BeforeTest
	public void bfTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	
	@AfterTest
	public void aftTest() {
		softAsrt.assertAll();
		driver.quit();
	}
	
}
