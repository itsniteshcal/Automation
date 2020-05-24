package qsp;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAndKeywordActions {
	public static void main(String[] args) throws AWTException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ESCAPE);
//		r.keyRelease(KeyEvent.VK_ESCAPE);
//		WebElement elec = driver.findElement(By.xpath("//span[.='Electronics']"));
//		Actions a=new Actions(driver);
//		a.moveToElement(elec).perform();
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("file:///C:/Users/Anup/Desktop/googly.html");
//		Thread.sleep(1000);
//		WebElement eleAddr = driver.findElement(By.xpath("//a[.='go to facebook']"));
//		Thread.sleep(3000);
//		Actions preeti = new Actions(driver);
//		preeti.contextClick(eleAddr).perform();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_T);
//		r.keyRelease(KeyEvent.VK_T);
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.google.com/");
//		  WebElement search = driver.findElement(By.name("q"));
//		  search.sendKeys("flipkart");
//		Actions actions = new Actions(driver);
//		actions.doubleClick(search).perform();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.id("box1"));
		WebElement tar = driver.findElement(By.xpath("//div[.='Italy']"));
		
		
		Actions Drag=new Actions(driver);
		Drag.dragAndDrop(src, tar).perform();
		
		
		
	}

}
