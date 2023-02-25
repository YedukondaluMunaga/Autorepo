package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectingvalue {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\Desktop\\driver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("theme")).sendKeys("Adventures");
		Thread.sleep(3000);
		WebElement Dropdowns= driver.findElement(By.name("theme"));
		Select st=new Select(Dropdowns);
		st.selectByIndex(10);
		Thread.sleep(3000);
		st.selectByVisibleText("Nature");
		Thread.sleep(3000);
		st.selectByValue("14");
		Thread.sleep(3000);
		
		driver.close();

	}

}
