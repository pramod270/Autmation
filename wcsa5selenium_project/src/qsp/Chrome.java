package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.get("https://www.google.com/");
		 driver.get("https://www.instagram.com/");
		 String pageTitle = driver.getTitle();
		 String pageSource = driver.getPageSource();
		 String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		 System.out.println(pageSource);

		 Thread.sleep(2000);
		 driver.close();
	}

}
