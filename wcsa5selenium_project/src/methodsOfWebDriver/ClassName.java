package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.com/");
     Thread.sleep(2000);
     driver.switchTo().activeElement().sendKeys("Ross Geller", Keys.ENTER);
     driver.findElement(By.className("lNPNe")).click();
     driver.findElement(By.linkText("open a popup window"));
     
	}

}
