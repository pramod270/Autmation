package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("pramod");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@text()='Next']")).click();
	Thread.sleep(2000);

	}

}
