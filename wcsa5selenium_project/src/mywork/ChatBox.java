package mywork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


	driver.get("https://www.bluestone.com");

	// Hamdle pop up
	driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).click();
	Thread.sleep(3000);
//	driver.switchTo().frame(5);
//    driver.switchTo().frame("fc_widget");
//    driver.findElement(By.id("chat-icon")).click();
	 
   WebElement findElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
	driver.switchTo().frame(findElement);
	driver.findElement(By.id("chat-icon")).click();

//	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chat-icon")));
//	
	
	}

}
