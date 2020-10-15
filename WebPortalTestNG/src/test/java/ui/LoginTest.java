package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
//	public static String browser = "firefox";
	public static WebDriver driver;

	@Parameters({"browser"})
	@Test
	public void launchApplication(String browser) {
		//System.out.println(browser.toUpperCase().equals("FIREFOX"));
		if (browser.toUpperCase().equals("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			//System.out.println("firefox");
		} else if (browser.toUpperCase().equals("CHROME")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("chrome");
		}
		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		driver.close();
		WebElement password = driver.findElement(By.id("password"));
		WebElement login	= driver.findElement(withTagName("input").above(password));
		WebElement button	= driver.findElement(withTagName("input").below(password));
		login.sendKeys("mehdi");
		button.click();
	}

}
