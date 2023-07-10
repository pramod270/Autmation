package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class RelativeXpath {
	
public static  void main (String [] args) throws InterruptedException {
	
 System.setProperty("Webdriver.chrome.driver","./driver/chrome.driver.exe");
		
 WebDriver driver= new ChromeDriver();
 
 driver.manage().window().maximize();
 
 driver.get("http://automationpractice.pl/index.php");
 
 //Relative Xpath=
 //syntax = //tagName[@Atrribute='Attribute value']
 
 driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shart");
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//button[@name='submit_search']")).click();
 Thread.sleep(2000);
	}

}
