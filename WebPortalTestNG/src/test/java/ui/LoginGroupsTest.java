package ui;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups="logGroup")
public class LoginGroupsTest {
	
	@Test(priority = 2, groups = "Login")
	public void Login1() {
		System.out.println("Login is successful1");
	}

	@Test(priority = 2, groups = "Login")
	public void Login2() {
		System.out.println("Login is successful2");
	}

	@Test(priority = 2, groups = "Login")
	public void Login3() {
		System.out.println("Login is successful3");
	}

	@Test(priority = 2, groups = "Login")
	public void Login4() {
		System.out.println("Login is successful4");
	}

	@Test(priority = 2, groups = "Login")
	public void Login5() {
		System.out.println("Login is successful5");
	}

	@Test(priority = 2, groups = {"Login","logout"})
	public void LoginLougout() {
		System.out.println("Login and Logout are successful....");
	}
	
	
	@Test(priority = 1,groups = "logout")
	public void Logout1() {
		System.out.println("Logout is successful1");
	}
	
	@Test(priority = 1,groups = "logout")
	public void Logout2() {
		System.out.println("Logout is successful2");
	}
	
	@Test(priority = 1,groups = "logout")
	public void Logout3() {
		System.out.println("Logout is successful3");
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
