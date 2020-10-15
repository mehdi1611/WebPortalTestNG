package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemoTest2 {

	@Test(dataProvider = "withName")
	public void test(String usrName, String pswd) {
		System.out.println(usrName+"        "+pswd);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(usrName);
		driver.findElement(By.id("password")).sendKeys(pswd);
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}
	
	@DataProvider(name="withName")
	public Object[][] dataSet1() {
		 return new Object[][]{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
		};
	}
	
}
