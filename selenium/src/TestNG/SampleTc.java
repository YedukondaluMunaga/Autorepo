package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTc {
	@BeforeTest
	public void openbrowser() {
		System.out.println("open the browser aviate to the page");
	}
	@Test
	@BeforeMethod
	public void testmethod1() {
		System.out.println("Test method1");
	}
	@Test(priority=1)
	public void Register() {
		System.out.println("Registration of the account");
	}
	@Test
	@AfterMethod
	public void testmethod2() {
		System.out.println("Test method2");
	}
	@Test
	public void login() {
		System.out.println("login operation");
	}
	@Test
	public void loginstatus() {
		System.out.println("login status of account is pass");
	}
	@Test
	public void logoutstatus() {
		System.out.println("logout status of the account");
	}
	@AfterTest
	public void close() {
		System.out.println("Close the browser");
	}

}
