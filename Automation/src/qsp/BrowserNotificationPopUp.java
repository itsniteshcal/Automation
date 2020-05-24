package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNotificationPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement kmli = driver.findElement(By.id("keepLoggedInCheckBox"));
		kmli.click();
		if(kmli.isSelected()) {
			System.out.println("already selected");
			
			
		}
		else {
			kmli.click();
			System.out.println("kmli is not selected");
		}
		
	}

}
