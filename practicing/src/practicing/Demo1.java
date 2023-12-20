package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./sel/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("aassgs");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("nssjs");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(5000);
	driver.close();
	//driver.findElement(By.xpath(""));
	}
} 