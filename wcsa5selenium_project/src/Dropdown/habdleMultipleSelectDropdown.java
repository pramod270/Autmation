package Dropdown;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class habdleMultipleSelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		// Implicit Wait ==
		//Syntax =
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

}
