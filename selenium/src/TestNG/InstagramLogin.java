package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InstagramLogin {
	WebDriver driver;
	@BeforeTest
	public void launchingapp()throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
	}
	@Test
	public void loginoperation()throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("6309648026");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lovely");
		driver.findElement(By.xpath("//div[@class='_aacl _aacn _aacu _aacx _aad6']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void loginstatus()throws InterruptedException{
		String actualUrl=driver.getCurrentUrl();
		String exceptedUrl="";
		if(actualUrl.equalsIgnoreCase(exceptedUrl)) {
			System.out.println("login successful");
		}
		else {
			System.out.println("login failed");
		}
		
	}
}

	


