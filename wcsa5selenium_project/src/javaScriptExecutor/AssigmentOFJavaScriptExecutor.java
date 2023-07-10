package javaScriptExecutor;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentOFJavaScriptExecutor {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	WebDriver driver	= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https:/in.puma.com/in/en");
	
 Robot act=new Robot(); 

 Thread.sleep(2000);
  act.keyPress(KeyEvent.VK_TAB);
  act.keyRelease(KeyEvent.VK_TAB);
  Thread.sleep(2000);
  
  act.keyPress(KeyEvent.VK_ENTER);
  act.keyPress(KeyEvent.VK_ENTER);
  
       WebElement loc = (WebElement) driver.findElement(By.xpath("//a[@aria-label='Go to PUMA x one8 PWRFRAME Aerogram Unisex Sneakers Puma Black-Puma Aged Silver']//div[@class='flex overflow-x-scroll hover:scroll-snap']//div[1]//img[1]")).getLocation();
  
       Thread.sleep(2000);
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(379,988)");
		  
	}

}
