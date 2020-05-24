package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginToApp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("uday");
		Thread.sleep(1000);;
		WebElement sday=driver.findElement(By.id("day"));
		Select day = new Select(sday);
		day.selectByVisibleText("30");
		Thread.sleep(1000);
		driver.findElement(By.id("month")).sendKeys("Feb");
		Thread.sleep(1000);
		driver.findElement(By.id("year")).sendKeys("1990");
		Thread.sleep(1000);
	}

}
