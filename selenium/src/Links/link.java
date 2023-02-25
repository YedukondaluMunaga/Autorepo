package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriverchromedriver","C:\\Users\\Lenovo\\Desktop");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.bing.com//");
		Thread.sleep(3000);
		
		driver1.findElement(By.linkText("Images")).click();
		driver1.getCurrentUrl();
		driver1.navigate().back();
		Thread.sleep(3000);
		
		driver1.findElement(By.linkText("Videos")).click();
		driver1.get("https://www.bing.com/videos/onecolumn/landing?form=Z9LH1");
		Thread.sleep(3000);
		driver1.navigate().back(); 
		Thread.sleep(3000);
		driver1.findElement(By.linkText("Maps")).click();
		driver1.get("https://www.bing.com/maps?FORM=Z9LH2&cp=17.427304%7E78.447189&lvl=11.0");
		Thread.sleep(3000);
		driver1.navigate().back();
		Thread.sleep(3000);
		
		driver1.findElement(By.linkText("Sign in")).click();
		 driver1.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&id=264960&wreply=https%3a%2f%2fwww.bing.com%2fsecure%2fPassport.aspx%3frequrl%3dhttps%253a%252f%252fwww.bing.com%252f%253fwlexpsignin%253d1%26sig%3d3B057C3606BD60182B216EB0071061B0&wp=MBI_SSL&lc=1033&CSRFToken=fc05992e-6953-4c26-997a-9c80351a3977&aadredir=1");
		Thread.sleep(3000);
		
		List<WebElement>nimages= driver1.findElements(By.tagName("img"));
		System.out.println("no of nimages="+nimages.size());
		for(int i=0;i<nimages.size();i++){
			System.out.println(nimages.get(i).getAttribute("src"));
			
		}
	}
}
		
		
	


	

	
		
	
