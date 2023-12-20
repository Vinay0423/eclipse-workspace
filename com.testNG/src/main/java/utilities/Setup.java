package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {

	static WebDriver driver;
	
	public static WebDriver BrowserSetup(String browsername,String url)
	{
		
		if (browsername.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./plugins/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		} else if(browsername.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./plugins/geckodriver.exe");
			driver = new FirefoxDriver(); 
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS); 
		} else if(browsername.equalsIgnoreCase("edge")) 
		{ 
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\com.gaugetesting\\plugins\\msedgedriver.exe"); 
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); 
		}
		
		
		driver.get(url);
		
		return driver;

	}
}
