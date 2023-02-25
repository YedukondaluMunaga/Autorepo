package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {
	public void read() throws IOException {
		FileInputStream fis=new FileInputStream("C:pathconfig.properties");
		Properties pr=new Properties();
		pr.load(fis);
		System.out.println(pr.getProperty("url"));
		System.out.println(pr.getProperty("author"));
		
	}

}
