package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssigment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		// To identify 
		driver.findElement(By.id("id_userLoginId")).sendKeys("pramod@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("pramod");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button [@class-'btn login-button btn-submit btn-small']")).click();
		Thread.sleep(2000);
		
		
		

	}

}
