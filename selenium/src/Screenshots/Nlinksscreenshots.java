package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Nlinksscreenshots {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver ,chromedriver", "C:\\Users\\Lenovo\\Desktop\\driver\\chromedriver108.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		List<WebElement>nlinks=driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
		WebElement dots=driver.findElement(By.xpath("//a[@class='gb_d']"));
	    for(int i=0;i<nlinks.size();i++) {
			String name= nlinks.get(i).getText();
			System.out.println(name);

			if(nlinks.get(i).isDisplayed()) {
				nlinks.get(i).click();
				Thread.sleep(3000);
				TakesScreenshot ts=(TakesScreenshot)driver;
				File ss=ts.getScreenshotAs(OutputType.FILE);
				Files.copy(ss,new File("C:\\Users\\Lenovo\\Desktop\\driver\\screenshots\\"+name+".png"));
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(3000);
				driver.close();
				
				
			}
		}
		

	}

}
