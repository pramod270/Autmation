package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
 Thread.sleep(2000);
	}

}
