package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLink {
	public static void main(String args[][]) throws InterruptedException{
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\Desktop");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com/");
		driver1.findElement(By.id("gmail")).getText();
		driver1.findElement(By.id("gmail")).getTagName();
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//div[@id='SIvCob']")).getText();
		}

}
