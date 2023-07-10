package synchronization;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./drivers/chromed.driver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		// Explicit Wait =
	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);// presss Enter work thid methods
	//Syntax ==
   WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
   element.click();
	}

}
