package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Framedemo1 {
	WebDriver driver;
	@BeforeTest
	public void launchapp() {
		System.setProperty("Webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");	
	}
	public void SingleFrame() throws InterruptedException{
		driver.findElement(By.linkText("Single Iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium browser");
		Thread.sleep(3000);
	}
	public void Iframes()throws InterruptedException{
		driver.findElement(By.linkText("Iframe with an Iframe")).click();
		Thread.sleep(3000);
		WebElement outerf=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerf);
		Thread.sleep(3000);	
		WebElement innerf=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerf);
		Thread.sleep(3000);	
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
