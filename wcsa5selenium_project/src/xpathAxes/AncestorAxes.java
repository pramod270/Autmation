package xpathAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AncestorAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./driver/chrome.driver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	
		
		// child =  Select all children of current nodes(one or many)
//we can access child nodes - travels to Ancestor because self nodes does not have any child nodes

  
		   List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Indo Count Inds.')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements: " + childs.size());

		// Ancestor = Select all ancestors(parent,grandparent,etc)
		 String text=driver.findElement(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr")).getText();
		System.out.println(text);
		
		//descendent == Select all descendant (children,grandchildren,etc.)of the current nodes.
		List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant nodes =" +descendant.size());
		
		
		//Following== Select everything in document after the closing tag of the current nodes
		
		List<WebElement> following= driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/following::tr"));
		System.out.println("Number of following Nodes:"+following.size());
		
		//Following-siblings = = Select all siblings after the current nodes
		 
			List<WebElement> followingsibling = driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following-sibling:"+followingsibling.size());
		
		
		//Preceding == Select all the nodes that appear before the current nodes in the Document.
		
		List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/preceding::tr"));
	System.out.println("Number of preceding nodes:"+preceding.size());
	
	
	//Preceding-sibling === Select all the sibling before the current nodes.
	
	List<WebElement> precedingsibling = driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/preceding-sibling::tr"));
	System.out.println("Number of preceding-sibling:"+precedingsibling.size());
	
	
	}

}
