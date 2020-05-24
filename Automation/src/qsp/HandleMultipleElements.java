package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Anup/Desktop/links.html");
		  //driver.findElements(By.tagName("a"));
	//	driver.findElements(By.className("links"));
		// 1) Count the number of links
//		 List<WebElement> allLinksAddr = driver.findElements(By.xpath("//a"));
//		 int noOfLinks=allLinksAddr.size();
//		 System.out.println(noOfLinks);
		// Get text of one element
		//WebElement oneLink= driver.findElement(By.id("i2"));
	      //           String text=oneLink.getText();
	        //         System.out.println(text);
		//2) To get text of mamy elements
//		List<WebElement> allLinkAddr = driver.findElements(By.tagName("a"));
//		for(int i=0;i<allLinkAddr.size();i++) {
//			WebElement oneLink = allLinkAddr.get(i);
//			String text=oneLink.getText();
//			System.out.println(text);
	//	Thread.sleep(3000);
//		}
//		List<WebElement> lastLink = driver.findElements(By.tagName("a"));
//		lastLink.get(lastLink.size()-1).click();
// EmptyLink
		List<WebElement> allLinkAdd = driver.findElements(By.tagName("b"));
		System.out.println(allLinkAdd.size());
			
		

	
	}

}
