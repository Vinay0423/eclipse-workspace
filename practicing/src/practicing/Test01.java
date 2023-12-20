package practicing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test01 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
 WebElement ele = driver.findElement(By.xpath("//select[@id='Skills']"));
 
Select ele1 = new Select(ele);
ele1.selectByIndex(2);
boolean bool1 = ele1.isMultiple();
System.out.println(bool1);
}

}
