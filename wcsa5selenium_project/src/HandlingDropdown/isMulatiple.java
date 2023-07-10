package HandlingDropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isMulatiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		

		WebDriver driver=new ChromeDriver();

		  driver.manage().window().maximize();
		  
		  driver.get("https://www.orangehrm.com/orangehrm-30-day-trail/");

	}

}
