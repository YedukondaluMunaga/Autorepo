package WorkingwithJSE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrollpage {
	WebDriver driver;
	@BeforeTest
	public void Launchapp() {
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
	}
	@Test
	public void Operation() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		// To scroll down to middle page
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		
		//to scroll down to end page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//scroll down to particular element
		WebElement readmore=driver.findElement(By.linkText("READ MORE"));
		js.executeScript("arguments[0].scrollIntoView(true);" , readmore);
		Thread.sleep(3000);
		
		// flashing the elements using java script executor
		WebElement number=driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li/a/div"));
		String backgroundcolor=number.getCssValue("backgroundcolor");
		for(int i=0;i<=100;i++) {
			js.executeScript("arguments[0].style.backgroundColor='#00FF00'",number);
			js.executeScript("arguments[0].style.backgroundColor= '" +backgroundcolor +"'",number);
			Thread.sleep(3000);	
		}
		
		
		
		//Drawing border to number
		WebElement number1=driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li/a/div"));
		js.executeScript( "arguments[0].style.border='3px solid red'",number1);
		Thread.sleep(3000);
		
		
		

		
	}

}
