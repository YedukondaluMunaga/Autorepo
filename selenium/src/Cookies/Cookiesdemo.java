package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Cookiesdemo {
	WebDriver driver;
	@BeforeTest
	public void launchapp() throws InterruptedException{
		System.setProperty("Webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mirror.co.uk/");	
		Thread.sleep(3000);
	}
	public void operation() throws InterruptedException {
		Set<Cookie> ncookies1=driver.manage().getCookies();
		System.out.println("Number of Cookies are:"+ncookies1.size());
		Thread.sleep(3000);
	}


}
