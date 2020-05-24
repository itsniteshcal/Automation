package methodDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
//		WebElement unTB = driver.findElement(By.id("username"));
//		driver.navigate().refresh();
//		unTB.sendKeys("admin");
	PageObjectModelClass p = new PageObjectModelClass(driver);
	driver.navigate().refresh();
	p.getUntb().sendKeys("admim");
		
	}

}
