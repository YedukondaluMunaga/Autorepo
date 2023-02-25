package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class orangehrmlogin {
	WebDriver driver;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet ws;
	Row r;

	@BeforeTest
	public void  launchapp() throws IOException,InterruptedException {
		System.setProperty("webdriver,chromedriver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipseprograms\\selenium\\src\\chromedriver109.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\DatafileApache POI.xlsx");
		wb=new XSSFWorkbook(fis);
		ws=wb.getSheet("Login");
		driver.get(ws.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(5000);
	}
	public void operation() throws IOException,InterruptedException {
		Thread.sleep(3000);
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\DatafileApache POI.xlsx");
		wb=new XSSFWorkbook("fis");
		ws=wb.getSheet("Login");
		driver.findElement(By.name("Username")).sendKeys(ws.getRow(2).getCell(0).getStringCellValue());
		driver.findElement(By.name("Password")).sendKeys(ws.getRow(2).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		//LoginValidation
		
		String EValue=ws.getRow(2).getCell(2).getStringCellValue();
		String AValue=driver.getCurrentUrl();
		Thread.sleep(5000);
		
		//Inserting Actual URL in to Excel
		
		if(EValue. contains(AValue)) {
			System.out.println("Pass");
			r.createCell(4).setCellValue("Pass");
		}
		else {
			System.out.println("Fail");
			r.createCell(4).setCellValue("Fail");
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\DatafileApache POI.xlsx");
		wb.write(fos);
	}
	@AfterTest
	public void close() {
		driver.close();
	}
		
		
		
		
		
	}


