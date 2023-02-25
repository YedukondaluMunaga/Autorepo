package WorkingwithWindowElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class downloadfileusingrobot {
	WebDriver driver;
	@BeforeTest

	public void launchapp() throws InterruptedException{
		System.setProperty("Webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		HashMap<String,Object> obj=new HashMap<String,Object>();
		obj.put("profile.default_content_settings.popups",0);
		obj.put("download_prompt_for_download",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");	
		Thread.sleep(3000);
	}
	@Test
	public void operation() throws AWTException {
		Robot rb=new Robot();
		driver.findElement(By.linkText("4.8.0")).click();
		rb.delay(3000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2000);
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
