package Xpath;

import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\Desktop\\driver\\chromedriver.108.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//AbsoluteXpath
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.close();
		
	

	}

}
