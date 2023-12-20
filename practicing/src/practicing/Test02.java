package practicing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test02 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	 driver.findElement(By.xpath("//a[.='SwitchTo']")).click();
	Actions actions = new Actions(driver);
	WebElement ele1 = driver.findElement(By.xpath("//a[.='Alerts']"));
	Thread.sleep(4000);
	actions.moveToElement(ele1).perform();
	ele1.click();
	//driver.close();
  }
}