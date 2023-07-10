package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetPostion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point p = new Point(400, 150);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.close();
		

	}

}
