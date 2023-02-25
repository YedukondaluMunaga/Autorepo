package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertwithTextbox {
	WebDriver driver;
	@BeforeTest
	public void LaunchApp() throws InterruptedException {
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
	}
	@Test
	public void Operation() throws InterruptedException{
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		driver.switchTo().alert().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		driver.switchTo().alert().sendKeys("Selenium with Java");
		Thread.sleep(3000);
	}
	

}
