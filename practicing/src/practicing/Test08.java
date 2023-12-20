package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test08 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();

     driver.switchTo().frame(0);
	
}
}
