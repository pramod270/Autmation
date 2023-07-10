package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		String pageTitle = driver.getTitle();
		
		

	}

}
