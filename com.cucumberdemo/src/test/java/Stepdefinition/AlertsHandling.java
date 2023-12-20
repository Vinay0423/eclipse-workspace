package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class AlertsHandling {
	WebDriver driver;
	
	@Given("Enter the url to delete customer page")
	public void enter_the_url_to_delete_customer_page() {
		System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	}
	
	@When("Enter the {int} in Input field")
	public void enter_the_in_input_field(Integer int1) {
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("int1");
	}

	@When("Click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	}

	@Then("Confirmation alert should popup")
	public void confirmation_alert_should_popup() {
		Alert act= driver.switchTo().alert();
		act.accept();
		
		
	}

	@Then("Accept the alert")
	public void accept_the_alert() {
		Alert act2= driver.switchTo().alert();
		act2.accept();
		driver.quit();
	}
}
