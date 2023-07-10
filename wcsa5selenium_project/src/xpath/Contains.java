package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","./driver/chrome.driver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.pl/index.php");
		
		//Contains ----=====Dynamic Xpath = 
		//Syntax =  //tagName[contains(@Attrubute Name,'Attribute Value')]
		
		driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("DRESESS");  //id=search_query_top
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@name,'search')]")).click();   //name=submit_search
		Thread.sleep(2000);
		
		
		//start-with function = 
		//syntax = //tagName[starts-with(@AN,'AV')]
		//driver.findElement(By.xpath("//input[starts-with(@id,'search_')]")).sendKeys("DREASSS");
       // Thread.sleep(2000);
       // driver.findElement(By.xpath("//button[starts-with(@name,'s')]")).click();
        //Thread.sleep(2000);
        
        
        
	}

}
