package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-ps6rqjtr/login.do");
		
		driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='pwd'])[1]")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='loginButton'])[1]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='content tasks_selected selected']//div//img)[1]")).click();
        Thread.sleep(2000);
	}

}
