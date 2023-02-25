package Texts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountandGetNormaltextAndBoldtext {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\Desktop");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> ntexts=driver.findElements(By.tagName("p"));
		System.out.println("The normal text is="+ntexts.size());
		for(int i=0;i<ntexts.size();i++) {
			System.out.println(ntexts.get(i).getText());
		}
		List<WebElement> btexts=driver.findElements(By.tagName("b"));
		System.out.println("The bold text is="+btexts.size());
		for(int j=0;j<btexts.size();j++) {
			System.out.println(btexts.get(j).getText());
		}
		Thread.sleep(3000);
		driver.close();

	}

}
