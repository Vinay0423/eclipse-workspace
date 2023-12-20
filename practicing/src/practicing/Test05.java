package practicing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test05 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement ele1 = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
	Actions act= new Actions(driver);
	act.doubleClick(ele1).perform();
}
}
