package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alertwithok {
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
	public void Operation()throws InterruptedException {
		driver.findElement(By.linkText("Alert with OK")).click();
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		driver.switchTo().alert().getText();
		Thread.sleep(3000);
	}
	
	

}

