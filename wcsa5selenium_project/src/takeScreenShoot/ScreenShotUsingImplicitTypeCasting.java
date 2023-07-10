package takeScreenShoot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotUsingImplicitTypeCasting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.google.com/");
	
	//Type casting from Webdriver to TakesScreenshot=
	
	//Upcast are browser spefic classes then we have to Explicit type cast WebDriver to take screenshot interface
	// we get screen shot by calling get screen shot as method which take argumentts.getScreenshotAs(OutputType.FILE);
	//which is File Type .
	//we create object file class and in the condtructor a File class we pass 3 thing 
	// path wwhrer we need to store the sreen shot 
	//File name with which we ant to store the screen shot
	
	// Etentiom(.png)
	// we use third party calss called as Files Which is Imported from com.goole.coommon.iopackage
	//We copied the OK END ScreenShot and Paste in specified path
	// File.copy(src,det); These line Through Ckech Exception that is IO Exception(Input/OutPut)
	TakesScreenshot ts = (TakesScreenshot) driver;
  File src = ts.getScreenshotAs(OutputType.FILE);
	
  File dest= new File("./screenshots/google.jpg");
  Files.copy(src, dest);
	}

}
