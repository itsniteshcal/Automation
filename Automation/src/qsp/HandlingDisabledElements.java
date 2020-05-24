package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class HandlingDisabledElements {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Anup/Desktop/selenium/disabled.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
		Thread.sleep(3000);
	//	RemoteWebDriver rwd=(RemoteWebDriver)driver;
	//	rwd.executeScript("document.getElementById('i2').value='manager'");
		JavascriptException jse=(JavascriptException)driver;
		
		
	}

}
