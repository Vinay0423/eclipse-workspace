package BaseMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test01 {

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	public void Register()
	{
		driver.get("https://demo.automationtesting.in/Register.html");
		
		 WebElement ele = driver.findElement(By.xpath("//select[@id='Skills']"));
		 
		Select ele1 = new Select(ele);
		ele1.selectByIndex(2);
		boolean bool1 = ele1.isMultiple();
		System.out.println(bool1);
	}
	
	
	@Test(priority = 2)
	public void moveToELement() throws InterruptedException
	{

		driver.get("https://demo.automationtesting.in/Register.html");
		
		 driver.findElement(By.xpath("//a[.='SwitchTo']")).click();
		Actions actions = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("//a[.='Alerts']"));
		Thread.sleep(4000);
		actions.moveToElement(ele1).perform();
		ele1.click();
	}
	
	@Test
	public void rightClick()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele1 = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act= new Actions(driver);
		act.contextClick(ele1).perform();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
}

