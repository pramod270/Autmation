package piyushtaty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.bluestone.com/");
	    driver.findElement(By.xpath("//span[.='Not now']")).click();
	    WebElement target = driver.findElement(By.xpath("//span[,='offers']"));
	    Actions act = new Actions(driver);
	    Thread.sleep(2000);
	    act.moveToElement(target).perform();
	    
	    
	    
	}

}
