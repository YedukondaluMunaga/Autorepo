package TestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMlogin {
	WebDriver driver;
	@BeforeTest
	public void launchingapp() throws InterruptedException{
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\Desktop\\driver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	@Test
	public void loginoperation()throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
	/*@Test
	public void logoutoperation()throws InterruptedException{
		driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}*/
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
