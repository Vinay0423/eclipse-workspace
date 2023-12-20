package practicing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test03 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./plugins/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement	ele1	=driver.findElement((By.id("box3")));
		WebElement	ele2    =driver.findElement(By.id("box103"));

		Actions act= new Actions(driver);
         act.dragAndDrop(ele1, ele2).perform();
         
         WebElement	ele3	=driver.findElement((By.id("box6")));
         WebElement	ele4	=driver.findElement((By.id("box106")));
          
         act.dragAndDrop(ele3, ele4).perform();


	}
}
