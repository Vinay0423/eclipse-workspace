package practicing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test06 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("112233");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	Alert act= driver.switchTo().alert();
	act.accept();
	
	Alert act2= driver.switchTo().alert();
	act2.accept();
	
	
}
}
