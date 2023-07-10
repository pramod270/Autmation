package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitiwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pramod_motar");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pramod@1234");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	
		

	}

}
