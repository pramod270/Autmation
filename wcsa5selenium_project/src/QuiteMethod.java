import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuiteMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://omayo.blogspot.com/");
   driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
   Thread.sleep(2000);
   driver.quit();
	}
}
