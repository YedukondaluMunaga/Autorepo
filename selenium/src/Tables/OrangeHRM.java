package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
	@BeforeTest
	public void launchingapp() throws InterruptedException{
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\Desktop\\driver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	@Test
	public void loginoperation()throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void PIMoperation() throws InterruptedException{
		WebElement list=driver.findElement(By.xpath("//div[@class='orange-container']"));
		List<WebElement> rows=driver.findElements(By.tagName("div"));
		for(int i=0;i<rows.size();i++) {
			List<WebElement>column=rows.get(i).findElements(By.tagName("div"));
			for(int j=0;j<column.size();j++) {
				System.out.println(column.get(i));
			}
			System.out.println();
			
		}
		Thread.sleep(3000);
	}

	@AfterTest
	public void close() {
		driver.close();
	}



}
