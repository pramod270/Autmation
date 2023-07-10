package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import qsp.Chrome;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		// To perform scrolling operation 
		
		JavascriptExecutor	jsp = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		//Scroll Right =
		jsp.executeAsyncScript("window.scrollBy(0,5000)"); 
		
		
	}

}
