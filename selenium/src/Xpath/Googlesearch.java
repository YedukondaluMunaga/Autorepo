package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\Desktop\\driver\\chromedriver108.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Https://www.google.com/");
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.tagName("q"));
		search.sendKeys("Java");
		Thread.sleep(3000);
		
		List<WebElement> values=driver.findElements(By.xpath("//ul[@role='listbox]/descendant::li'"));
		for(int i=0;i<values.size();i++) {
			String names=values.get(i).getText();
			if(names.equalsIgnoreCase("Java")) {
				values.get(i).click();
				Thread.sleep(3000);
				break;
				
			}
		}

		driver.close();
		
	

	}
	}


