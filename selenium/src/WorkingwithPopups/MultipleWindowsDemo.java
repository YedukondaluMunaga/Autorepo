package WorkingwithPopups;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MultipleWindowsDemo {
	WebDriver driver;
	@BeforeTest
	public void app() throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
	}
	@Test
	public void windows() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='nav']/descendant::a[text()='Credit Cards' and @id='topMnucreditcards']")).click();
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class='mmoffer-parent1']/ul/descendant::li/a/p[text()='Apply for a Credit Card – Get ₹3000 Cashback!']")).click();
		Thread.sleep(3000);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext())
		{
			String childwindow=it.next();
			if(!childwindow.contains(parent)) {
				driver.switchTo().window(childwindow);
				Thread.sleep(3000);
				List<WebElement>links=driver.findElements(By.tagName("a"));
				System.out.println("Number of links in child window are:"+links.size());
				for(int i=0;i<links.size();i++) {
					System.out.println(links.get(i).getText());
				}
				driver.close();
				}
			}
		driver.switchTo().window(parent);
		driver.close();
			
		}
	

}
