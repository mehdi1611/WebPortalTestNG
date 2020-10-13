package ui;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority = 2,description = "this is a login test")
	public void Login() {
		System.out.println("Login is successful");
	}
	
	@Test(priority = 1,description = "this is a logout test")
	public void Logout() {
		System.out.println("Logout is successful");
	}
	
	@BeforeTest
	public void beforeLogin() {
		System.out.println("this is executed before all the tests");
	}
	
	@AfterTest
	public void afterLogin() {
		System.out.println("this is executed after all the test...");
	}
	
	@BeforeMethod
	public void beforeEachTest() {
		System.out.println("this is executed before each test...");
	}
	
	@AfterMethod
	public void afterEachTest() {
		System.out.println("this is executed after each test...");
	}
}
