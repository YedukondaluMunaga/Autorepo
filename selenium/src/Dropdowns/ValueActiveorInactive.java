package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueActiveorInactive {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\Desktop\\driver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(3000);
		WebElement Dropdowns=driver.findElement(By.name("theme"));
		List<WebElement>values=Dropdowns.findElements(By.tagName("Option"));
		for(int i=0;i<values.size();i++) {
			String Vname= values.get(i).getText();
			values.get(i).click();
			if(values.get(i).isSelected()) {
				System.out.println(Vname+" "+  "Active");
			}
			System.out.println(Vname+" "+ "is not Active");
		}
		driver.close();
		


	}

}
