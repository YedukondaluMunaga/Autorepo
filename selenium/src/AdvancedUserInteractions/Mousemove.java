package AdvancedUserInteractions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousemove {
	WebDriver driver;
	@BeforeTest
	public void launchapp() throws InterruptedException{
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	}
	@Test
	public void operation()throws InterruptedException {
		driver.findElement(By.linkText("Fashion"));
		Actions ac=new Actions(driver);
		Thread.sleep(3000);
	}
	
	

}
