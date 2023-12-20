package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utilities.Setup;

public class Pratice01 {
WebDriver driver;
	
	@BeforeClass
	public void test01()
	{
		System.setProperty("webdriver.chrome.driver", "./plugins/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);		

	}
	
	@Test(priority = 1,groups = {"group1"})
	public void test02()
	{
		System.setProperty("webdriver.chrome.driver", "./plugins/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);		

		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("hiii");
	    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	}
	
	@Test(priority = 2)
	public void  test03() throws InterruptedException
	{
		Alert act=driver.switchTo().alert();
		act.accept();
		Thread.sleep(5000);
		act.accept();

	}
	
	@AfterClass
	public void test04()
{
		driver.close();}
}
