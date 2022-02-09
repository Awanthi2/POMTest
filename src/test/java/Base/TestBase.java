package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static	Properties prop;
public static WebDriver driver;

	public TestBase() {
	//FileInputStream fin=new FileImageInputStream(System.getProperty(null))
		String path=System.getProperty("user.dir")+"//src//test//resources//configFiles//config.properties";
		FileInputStream fin;
		try {
			fin=new FileInputStream(path);
			prop=new Properties();
			try {
								prop.load(fin);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
public static void initialize()
{
	String strbrowser=prop.getProperty("browser");
	if(strbrowser.equalsIgnoreCase("chrome"))
	{
		//driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	}
}
}
