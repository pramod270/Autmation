package xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("bikes");
		Thread.sleep(2000);
	 List<WebElement> bikes = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
        
        for(int i=0;i<bikes.size();i++) {
        	String bikesOption = bikes.get(i).getText();
        	System.out.println(bikesOption);
        	Thread.sleep(1000);
		        
		        }
	}
}
		        	
		        
				


