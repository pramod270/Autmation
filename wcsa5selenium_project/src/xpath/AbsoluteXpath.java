package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qsp.Chrome;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./driver/chrome.driver.exe");
		
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("http://automationpractice.pl/index.php");
	 
	 //Absolute Xpath=
	 driver.findElement(By.xpath(" /html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-shart");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(" /html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
	Thread.sleep(2000);


	}

}
