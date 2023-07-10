package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUniqueattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-ps6rqjtr/login.do");
		Thread.sleep(2000);
		
		//case 1 syntax = //tagName[@AN='AV']
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		driver.findElement(By.xpath("//select[@name='usersSelector.selectedUser']")).sendKeys("pramod");
		

	}

}
