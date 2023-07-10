package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("Webdriver.Chrome.driver","./driver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://automationpractice.pl/index.php");
	
	// text() ==
    // Syntax = //tagName[text()='text of web element']	
	driver.findElement(By.xpath("//a[text()='Women']")).click();
     Thread.sleep(2000);
  
  
  //chained Xpath ===
  //Two ways we can write Xpath ==  parent to child
  //form[@id='searchbox']//input[4]
  ////form[@id='searchbox']//input[@id='search_query_top']
  // Syntax == 
		//  driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("T-SHIRT");
		 // Thread.sleep(2000);
		  
	// driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T=SHIRT");
	      Thread.sleep(2000);
   //   driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
     Thread.sleep(2000);	
	}
	

}
