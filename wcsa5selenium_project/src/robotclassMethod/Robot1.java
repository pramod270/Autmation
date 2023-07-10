package robotclassMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        Thread.sleep(2000);
        
        
        // to genarate print pop up
       Robot robot = new Robot();
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_P);
       Thread.sleep(2000);
       
//       releade to ctrl+p button
       robot.keyRelease(KeyEvent.VK_CONTROL); // release ctrl
       robot.keyRelease(KeyEvent.VK_P); //release p
       Thread.sleep(2000);
       
       robot.keyPress(KeyEvent.VK_TAB);
       robot.keyRelease(KeyEvent.VK_TAB);
       
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(2000);
       //robot.keyPress(KeyEvent.VK_TAB);
       
       //robot.keyPress(KeyEvent.VK_TAB);
       //robot.keyRelease(KeyEvent.VK_ENTER);
       
       
       }
   
       
       
       
       
       
       
       
	}
       

