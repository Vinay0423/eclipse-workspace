package practicing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test07 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Windows.html");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String title = driver.getTitle();
	Thread.sleep(4000);
	String tt = "Frames & windows";
	if(title.equals(tt))
	{
		System.out.println(" we are in correct page");
	}else {
		System.out.println("we are in wrong page , but i will continue with my automation");
	}
	String parenthandle=driver.getWindowHandle();
	System.out.println("parent windowhandle is "+parenthandle);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
	Thread.sleep(4000);
	String indextitle="Index";
	String currenthandle=driver.getWindowHandle();
	System.out.println("current windowhandle is "+currenthandle);
	for(String winHandle:driver.getWindowHandles())
	{
		if(driver.switchTo().window(winHandle).getTitle().equals(indextitle))
		{
			break;
		}
		else {
			driver.switchTo().window(currenthandle);
		}
	}
	
	String titl1=driver.getTitle();
	if(indextitle.equals(titl1))
	{
		System.out.println("We are in index page");
	}else {
		System.out.println("We are not in index page");
	}
	WebElement ele1=driver.findElement(By.xpath("//*[@id=\"btn1\"]"));
	boolean b1=ele1.isDisplayed();
	System.out.println("Sigin element found is "+b1);
	WebElement ele2=driver.findElement(By.xpath("//*[@id=\"btn2\"]"));
	boolean b2=ele2.isDisplayed();
	System.out.println("skip Sigin element found is "+b2);
	
if(b1==b2)
{
System.out.println("all elements displayed");
}else {
System.out.println("not all elements displayed");
}
String s2="Selenium";
for(String w1:driver.getWindowHandles()) {
if(driver.switchTo().window(w1).getTitle().equals(s2))
{
	break;
}
}

driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[4]/a")).click();
WebElement present = driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/h1"));
boolean b3=present.isDisplayed();
System.out.println(b3);

File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File des= new File("D:\\Demoscreenshot\\snap.png");
FileUtils.copyFile(src, des);


driver.switchTo().window(currenthandle);
driver.quit();

}
}
