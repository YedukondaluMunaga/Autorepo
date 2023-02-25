package Radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countandgetnames {
	public static void main(String args[])throws InterruptedException {
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\Desktop");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.mercurytravels.co.in/");
		driver1.findElement(By.linkText("Flights")).click();
		List<WebElement> nradios=driver1.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("no of radiobuttons:"+ nradios.size());
		for(int i=0;i<nradios.size();i++) {
			System.out.println(nradios.get(i).getAttribute("name"));
		}
		Thread.sleep(30000);
		driver1.close();
		

	}
}
