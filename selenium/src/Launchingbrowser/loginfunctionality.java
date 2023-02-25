package Launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfunctionality {
	public static void main(String args[])throws InterruptedException {
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\Desktop");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/login");
	
		driver1.findElement(By.id("email")).sendKeys("");
		driver1.findElement(By.id("password")).sendKeys("");
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//button[@type='sumbit']")).click();
		driver1.close();
	}

}
