package xpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./driver/chrome.driver.exe");
	WebDriver	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/");
	
	// 7)Identify the Today's Deals link from the amazon search text box present in the amazon home page.(following).
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::a[contains(text(),'Today')]"));

// 8) Identify the Hello , Signin from the amazon search text box present in the amazon home page.(Following).
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//following::span[contains(text(),'Hello, sign in')]")).click();
	
	
	//9) Identify the Customer services link which is part of Menu bar - amazon (Descedent).
	driver.findElement(By.xpath("//div[@id='nav-xshop']/descendant::a[contains(text(),'Customer Service')]"));
	}

}
