package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");
		Thread.sleep(3000);
		un.clear();
		//Thread.sleep(3000);
		System.out.println("Tag: "+un.getAttribute("class"));
		System.out.println("tag: "+ un.getTagName());
		
		
	}

}
