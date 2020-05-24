package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingPopUps1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("file:///C:/Users/Anup/Desktop/selenium/popup.html");
//		driver.findElement(By.xpath("//button[.='Login']")).click();
//       Alert al = driver.switchTo().alert();	
//       al.dismiss();
	ChromeOptions c= new ChromeOptions();
	Thread.sleep(3000);
	c.addArguments("--disable-notifications");
	
	c.addArguments("start-maximized");
	WebDriver driver= new ChromeDriver(c);
	Thread.sleep(2000);
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(3000);
	driver.findElement(By.id("DepartDate")).click();
	driver.findElement(By.xpath("(//a[.='30'])[1]")).click();;
	
		
	}

}
