package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.testng.annotations.Test;

public class Pratice02 {

	WebDriver driver;
	
	@Test(priority = 1,groups = {"sanity"})
	public void dragAndDrop() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
	   driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement	ele1	=driver.findElement((By.id("box3")));
		WebElement	ele2    =driver.findElement(By.id("box103"));
		JavascriptExecutor exc=(JavascriptExecutor)driver;
		exc.executeScript("window.scrollBy(0,150)");
		
		Thread.sleep(5000);
		
		Actions act= new Actions(driver);
         act.dragAndDrop(ele1, ele2).perform();
	}
	
	@Test(priority = 2,groups =  {"sanity","group1"})
	public void rightClick() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		WebElement ele1 = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act= new Actions(driver);
		act.contextClick(ele1).perform();
	}
}
