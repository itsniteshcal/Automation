package real;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("firstname"));
		email.sendKeys("admin");
		Thread.sleep(3000);
		email.sendKeys(Keys.CONTROL,"a");
		email.sendKeys(Keys.CONTROL,"c");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys(Keys.CONTROL,"v");
		
		
	}

}