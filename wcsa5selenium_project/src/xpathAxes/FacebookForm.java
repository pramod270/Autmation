package xpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","./driver/chrome.driver.exe");
	         
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/reg/?");
        
        //1)Find the sing-up button from the registration form present in the facebook application.(child)
          
        //driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[11]/button")).click();
       // Thread.sleep(2000);
        
        //2) Locate the first Name field from Sing-up button in facebook (parent).
        
       //  driver.findElement(By.xpath("//button[@id='u_0_s_NZ']/parent::*/parent::*/child::div[1]/div/div[1]")).click();
        

        //3)Identify the password from Mobile filed in facebook.(following).
       driver.findElement(By.xpath("//input[@id='u_0_g_up']/following::input"));
        
     //4)Locate Mobile number from newpasswords field in facebook(preceding) 
        
       //driver.findElement(By.xpath("//input[@id='password_step_input']/preceding::input[2]")).sendKeys("122243554");
	
       
	//5)Locate surname from female Radio button in facebook (ancestor).
       //driver.findElement(By.xpath("//input[@id='u_0_4_2j']/ancestor::div[2]/div[1]/div/div[2]"));
       //another ways to identify=
	driver.findElement(By.xpath("//input[@id='u_0_4_2j']/ancestor::div[2]//input[@id='u_0_d_Sq']"));
	}
	
}
