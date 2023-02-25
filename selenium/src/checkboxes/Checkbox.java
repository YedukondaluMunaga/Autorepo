package checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String args[]) {
		System.setProperty("webdriveer,chromedriver","C:\\Users\\Lenovo\\Desktop");
		ChromeDriver driver1=new ChromeDriver();
		
		//driver1.manage().window().minimize();
		driver1.get("https://www.spicejet.co.in/");
		driver1.findElement(By.linkText("checkbox")).click();
		List<WebElement> checkbox= driver1.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("the number of checkboxes are:"+checkbox.size());
		for(int j=0;j<checkbox.size();j++) {
			String cname= checkbox.get(j).getAttribute("name");
		}
	}
}
				
							
			
	
	
		
	


