package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
WebDriver driver=new ChromeDriver();

  driver.manage().window().maximize();
  
  driver.get("https://www.opencart.com/index.php?route=account/register");
	
  WebElement drpCountryEle = driver.findElement(By.id("input-country"));
	
  Select sel = new Select(drpCountryEle);
	//SelectByVisisble Text =
 // sel.selectByVisibleText("Denmark");
  
  //SelectByValue ==
  //sel.selectByValue("10");
  
  //Select BYIndex ==
  sel.selectByIndex(12);
	}

}
