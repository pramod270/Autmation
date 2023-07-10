package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("http://laptop-ps6rqjtr/login.do");
		
		// To identify 
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class = 'btn login-button btn-submit btn-small']")).click();
		

	}

}
