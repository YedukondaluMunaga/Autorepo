package TestNGListner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verifyinglogin {
	WebDriver driver;
	@BeforeTest
	public void LaunchApp() throws InterruptedException{
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(3000);
	}
	@Test
	public void Login()throws InterruptedException{
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li[1]")).click();
		driver.findElement(By.linkText("User Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign_user_email")).sendKeys("yedukondalumunaga1@gmail.com");
		driver.findElement(By.id("sign_user_password")).sendKeys("lovelyM7$");
		driver.findElement(By.xpath("//input[@id='sign_user_password']/following-sibling::button")).click();
		Thread.sleep(3000);
	}
	@Test
	public void loginstatus() {
		String excepted="Welcome,yedukondalu";
		String actual=driver.findElement(By.partialLinkText("Welcome")).getText();
		System.out.println(actual);
	}
		@Test
		public void Logout()
		{
			driver.findElement(By.partialLinkText("Welcome")).click();
			driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/descendant::a[text()=' Log Out']")).click();
			
		}
	}
	

	

	
