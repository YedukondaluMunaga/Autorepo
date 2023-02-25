package Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertionusingorangeHRMpage {
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
	public void loginoperation() throws InterruptedException{
		driver.findElement(By.id("email")).sendKeys("6309648026",Keys.ENTER);
		Thread.sleep(3000);
		String ActualTitle=driver.getTitle();
		String ExceptedTitle="";
		Assert.assertEquals(ActualTitle, ExceptedTitle,"Title is mismatched");
		
		//url assertion
		String ActualUrl=driver.getCurrentUrl();
		String ExceptedUrl="";
		
		//Borderassertion
		String ActualBorder=driver.findElement(By.name("email")).getCssValue("border");
		System.out.println(ActualBorder);
		String ExceptedBorder="lpx solid rgb(240,40,73)";
		Assert.assertEquals(ActualBorder,ExceptedBorder,"border color mismatched");
	}
	
}



	
