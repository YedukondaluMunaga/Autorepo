package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apachedemoprogram {
	@Test
	public void Exceloperation() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\demo.xlsx.xlsx");
		 // the file input stream is used to read the raw bytes of data 
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("demo.xlsx");
		 // inserting 10 numbers in 10rows and in 1st column
		
		for(int i=0;i<=10;i++) {
			sheet.createRow(0).createCell(i).setCellValue(i);
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\demo.xlsx.xlsx"); 
		book.write(fos);
	}
}
	

