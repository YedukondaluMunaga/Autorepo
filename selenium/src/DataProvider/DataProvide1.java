package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.com.google.common.collect.ObjectArrays;

public class DataProvide1 {
	WebDriver driver;
	@BeforeTest
	public void launchApp()throws InterruptedException{
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
	}
	@Test(dataProvider="testdata")
	public void Login(String username,String password)throws InterruptedException{
		driver.findElement(By.name("username")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	@DataProvider(name="testdata")
	public Object[][] data(){
		Object[][]obj=new Object[3][2];
		obj[0][0]="Admin";
		obj[0][1]="admin123";
		
		obj[1][0]="admin12";
		obj[1][1]="admin123";
		
		obj[2][0]="admin";
		obj[2][1]="admin";
		
		return obj;
		
	}
	
	

}
