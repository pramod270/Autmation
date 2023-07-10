package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Or {

	public static void main(String[] args) throws InterruptedException {
    
		 System.setProperty("Webdriver.chrome.driver","./driver/chrome.driver.exe");
			
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://automationpractice.pl/index.php");
		 
		 //Xpath with 'or' =
		 //Syntax=== //tagName[@Attribute Name='Attribute value'or@Attribute Name= 'Attribute Value']s
		   
		 driver.findElement(By.xpath("//input[@id='search_query_top'or@name='search_query']")).sendKeys("T-SHIRTS");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit'or@name='submit_search']")).click();
		 Thread.sleep(2000);

	}

}
