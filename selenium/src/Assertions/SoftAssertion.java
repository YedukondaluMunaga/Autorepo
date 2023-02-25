package Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	WebDriver driver;
	@BeforeTest
	public void launchingapp() {
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	@Test
	public void login() throws InterruptedException{
		driver.findElement(By.id("email")).sendKeys("6309648026",Keys.ENTER);
		driver.findElement(By.id("pass")).sendKeys("lovelyM7$",Keys.ENTER);
		Thread.sleep(3000);
		SoftAssert sa=new SoftAssert();
		
		// TitleAssertion
		String ActualTitle=driver.getTitle();
		String ExceptedTitle="https://www.facebook.com/";
		sa.assertEquals(ActualTitle,ExceptedTitle,"Title is mismatched");
		
		driver.close();
	}
}