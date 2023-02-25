package AdvancedUserInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDropByDemo {
	WebDriver driver;
	@BeforeTest
	public void LaunchApp() throws InterruptedException {
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://jqueryui.com/slider/");
		Thread.sleep(3000);
	}
	@Test
	public void Operation() throws InterruptedException{
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']"));
		Actions ac=new Actions(driver);
		int loc=slider.getLocation().x;
		ac.dragAndDropBy(slider,65,loc).build().perform();
		Thread.sleep(3000);
		
	}
	


}
