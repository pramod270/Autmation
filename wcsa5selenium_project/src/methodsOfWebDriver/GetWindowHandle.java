package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://omayo.blogspot.com/");
		String parentHandle = driver.getWindowHandle();
		System.out.println("Addres of parent Window :" +parentHandle);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
 Set<String> Set = driver.getWindowHandles();
	System.out.println(Set);
	for (String string : Set) {
		driver.close();
	}
		
	}

}
