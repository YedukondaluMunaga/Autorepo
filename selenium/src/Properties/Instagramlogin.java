package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Instagramlogin {
	WebDriver driver;
	@BeforeTest
	public void launchApp()  throws InterruptedException{
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void operatiologin() throws InterruptedException, IOException{
	
		FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\Properties");
		Properties pr=new Properties();
		pr.load(fis);
		
		driver.findElement(By.name(pr.getProperty("username"))).clear();
		driver.findElement(By.name(pr.getProperty("username"))).sendKeys("6309648026");
		driver.findElement(By.name(pr.getProperty("password"))).clear();
		driver.findElement(By.name(pr.getProperty("password"))).sendKeys("964248");
		driver.findElement(By.xpath(pr.getProperty("button"))).click();
		Thread.sleep(3000);	

		
	}


}
