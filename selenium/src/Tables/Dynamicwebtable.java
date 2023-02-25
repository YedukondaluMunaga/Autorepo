package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Dynamicwebtable {
	WebDriver driver;
	@BeforeTest
	public void launchapp() throws InterruptedException{
		System.setProperty("Webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/worldclock/");	
		Thread.sleep(3000);
	}
		public void Operation()	{
		WebElement table=driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']"));
		List<WebElement> nrows=driver.findElements(By.tagName("tr"));
		for(int i=0;i< nrows.size();i++) {
			
				List<WebElement> ncolumns=nrows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<ncolumns.size();j++) {
					System.out.println(ncolumns.get(j).getText());	
				}
				System.out.println();				
		}
	}
		@AfterTest
		public void close() {
			driver.close();
			
		}
	
}


	

//(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]

	

