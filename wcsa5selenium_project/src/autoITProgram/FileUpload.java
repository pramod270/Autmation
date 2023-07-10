package autoITProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://omayo.blogspot.com/");
  Thread.sleep(1000);
WebElement target = driver.findElement(By.xpath("//input[@id='uploadfile']"));
Actions act = new Actions(driver);
act.doubleClick(target).perform();


  
  
  
  



	}

}
