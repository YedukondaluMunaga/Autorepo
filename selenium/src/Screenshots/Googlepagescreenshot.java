package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Googlepagescreenshot {
	public static void main(String args[]) throws IOException,InterruptedException {
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		TakesScreenshot ts=driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(ss,new File("C:\\Users\\Lenovo\\Downloads\\screenshots\\googlepage.JPG"));
		Thread.sleep(3000);
		driver.close();
		
		}

}
