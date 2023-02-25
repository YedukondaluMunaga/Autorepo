package Radiobuttons;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class StatusoftheRadioButtons {
	public static void main(String args[])throws InterruptedException {
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\Desktop");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.mercurytravels.co.in/");
		Thread.sleep(3000);
		
		driver1.findElement(By.linkText("Flights")).click();
		List<WebElement> radios=driver1.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<radios.size();i++) {
			String rname=radios.get(i).getAttribute("name");
			if(radios.get(i).isDisplayed()) {
				System.out.println(rname+"is active");
			}
			else {
				System.out.println(rname+"is not  active");
			}
		}
		driver1.close();
	

		
		
	}

}

