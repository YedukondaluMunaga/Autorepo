package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdownvalues {
	WebDriver driver;
	@BeforeTest
	public void launchingapp() throws InterruptedException{
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(8000);
	}
	@Test
	public void Operation() throws InterruptedException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\holidayvalues.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("holidayvalues");
		WebElement dropdown=driver.findElement(By.name("theme"));
		List<WebElement> values=dropdown.findElements(By.tagName("option"));
		for(int i=0;i<values.size();i++) {
			ws.createRow(0).createCell(i).setCellValue(values.get(i).getText());			
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\holidayvalues.xlsx");
		wb.write(fos);
		wb.close();
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

	}


