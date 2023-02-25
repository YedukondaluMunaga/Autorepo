package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMloginProperties {
	WebDriver driver;
	@BeforeTest
	public void launchApp()  throws InterruptedException{
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void operation() throws InterruptedException, IOException{
		Thread.sleep(3000);
		FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\Properties");
		Properties pr=new Properties();
		pr.load(fis);
		
		driver.findElement(By.name(pr.getProperty("name"))).clear();
		driver.findElement(By.name(pr.getProperty("name"))).sendKeys("Admin");
		driver.findElement(By.name(pr.getProperty("password"))).clear();
		driver.findElement(By.name(pr.getProperty("password"))).sendKeys("admin123");
		driver.findElement(By.xpath(pr.getProperty("button"))).click();
		Thread.sleep(3000);	
	}
	

}

