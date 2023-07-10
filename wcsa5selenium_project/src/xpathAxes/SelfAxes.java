package xpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./driver/chrome.driver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
     driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
     
     //self Axes= SElf locating.
    	//	 Syntax = //tagname[conatins(text(),'AV')] 
     
     //getText() = Once identify element and text is displayed inside the element wil be capture.
     // Create one varible and print Them.
     
     String text =driver.findElement(By.xpath("//a[contains(text(),'Indo Count Inds.')]/self::a")).getText();
    System.out.println(text);
    
     Thread.sleep(2000);
		

	}

}
