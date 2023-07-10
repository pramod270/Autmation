package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//div[contains(@class,'_4rR01T')]/../..//div[contains(@class,'30jeq3 _1_WHN1')]")).click();
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_3879cV']")).click();
	}

}
