package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class DragandDrop {
	
	WebDriver driver; 
	
	@Given("Enter the url")
	public void enter_the_url() {
		System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	}

	@When("Capitals will drag and drop on Respective country")
	public void capitals_will_drag_and_drop_on_respective_country() {

		WebElement	ele1	=driver.findElement((By.id("box3")));
		WebElement	ele2    =driver.findElement(By.id("box103"));
		Actions act= new Actions(driver);
        act.dragAndDrop(ele1, ele2).perform();
        WebElement	ele3	=driver.findElement((By.id("box6")));
        WebElement	ele4	=driver.findElement((By.id("box106")));
         
        act.dragAndDrop(ele3, ele4).perform();
	}

	@Then("If correct capitals is dropped the box will display  in green color")
	public void if_correct_capitals_is_dropped_the_box_will_display_in_green_color() {
	boolean color	= driver.findElement(By.xpath("//div[@style='visibility: visible; background-color: rgb(0, 255, 0);']")).isDisplayed();
        if(color==true) {
        	System.out.println(color+" green is displayed and so connfirmed that right capital dropped on country");
        } else {
         System.out.println(" not selected right capital");
        }
        driver.quit();
	}
}
