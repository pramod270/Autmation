package mywork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchchromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Relative path of Driver executable file
//System.setProperty("webdriverChrome.driver", "./driver/chromedriver.exe");
 System.setProperty("webdriveredge.driver", "./driver/msedgedriver.exe");

		//To launch chrome Browser
		//new ChromeDriver(); 
		//new FirefoxDriver();
              WebDriver driver=new EdgeDriver();
              Thread.sleep(2000);
              driver.close();
              driver.manage().window().maximize();

	}

}
