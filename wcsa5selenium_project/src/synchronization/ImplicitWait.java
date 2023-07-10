package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		// Implicit Wait ==
		//Syntax =
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		// mouse press action (Enter key)
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		
        
	}

}
