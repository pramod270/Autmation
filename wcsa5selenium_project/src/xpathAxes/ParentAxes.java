package xpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./driver/chrome.driver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		//parent Axes== 
		
	String text= driver.findElement(By.xpath("//a[contains(text(),'Indo Count Inds.')]/parent::td")).getTagName();
		System.out.println(text);
		Thread.sleep(2000);

	}

}
