package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\anurag\\eclipse-nit\\Automation\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement element=driver.findElement(By.name("q"));
	element.sendKeys("java");
	element.sendKeys(Keys.ENTER);
	//driver.findElement(By.name("btnK")).click();
	driver.manage().window().maximize();
	
	
	
	//driver.close();
	}

}

