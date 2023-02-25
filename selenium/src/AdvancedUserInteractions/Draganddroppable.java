package AdvancedUserInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Draganddroppable {
	WebDriver driver;
	private WebElement draganddroppable;
	@BeforeTest
	public void LaunchApp() throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
	}
	public void operation() throws InterruptedException{
		 driver.switchTo().frame(0);
		WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(3000);
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
