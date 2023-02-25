package AdvancedUserInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class DoubleClick {
	WebDriver driver;
	@BeforeTest
	public void LaunchApp() {
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
	}
	public void Operation() throws InterruptedException{
		WebElement DoubleClick=driver.findElement(By.xpath("//button[@type='button']"));
		Actions ac=new Actions(driver);
		ac.doubleClick(DoubleClick).build().perform();
		Thread.sleep(3000);
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	
	

}
