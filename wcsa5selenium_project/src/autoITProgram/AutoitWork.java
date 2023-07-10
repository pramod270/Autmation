package autoITProgram;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoitWork {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
 Thread.sleep(1000);
   Actions act=new Actions(driver);
	WebElement uploadfile =driver.findElement(By.xpath("//input[@id='uploadfile']"));
	act.doubleClick(uploadfile).perform();
	Runtime.getRuntime().exec("./AutoITFolder/OmayoFileUpload.exe");
	
	}

}
