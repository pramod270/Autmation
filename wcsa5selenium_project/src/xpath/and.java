package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class and {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./driver/chrome.driver.exe");
		
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();	
    
    driver.get("http://automationpractice.pl/index.php");
    
    // XPath with 'and'  = = = 
    //Syntax //input[@Attribute Name='Attribute Value'and@Attribute Name='Attribute value']
    
    driver.findElement(By.xpath("//input[@id='search_query_top'and@name='search_query']")).sendKeys("T-SHIRTS");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[@type='submit'and@name='submit_search']")).click();
    Thread.sleep(2000);
    
		

	}

}
