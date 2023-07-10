package xpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./driver/chrome.driver.exe");
		
WebDriver driver =new ChromeDriver();
 
driver.manage().window().maximize();

//6) Identify the search text box from the google search button present in the google search home page .(Parent).

driver.get("https://www.google.com/");
driver.findElement(By.xpath("(//input[@name='btnK'])[2]/parent::*/parent::*/parent::*/div[1]"));

	}

}
