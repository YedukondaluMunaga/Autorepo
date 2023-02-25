package Launchingbrowser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
public class Launchingbrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome.driver","C:\\Users\\Lenovo\\Desktop");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.goibibo.com/");
		driver1.navigate().forward();
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		Thread.sleep(5000);
		driver1.close();

	}

}
