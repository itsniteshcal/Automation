package real;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripDynamicDD {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		  WebElement from = driver.findElement(By.id("FromTag"));
		from.sendKeys("del");
		Thread.sleep(4000);
//		List<WebElement> alloptions = driver.findElements(By.xpath("//a[contains(@id,'ui-id')]"));
//		System.out.println(alloptions.size());
//		for(int i=0;i<=alloptions.size()-1;i++) {
//			System.out.println(alloptions.get(i).getText());
//			from.sendKeys(Keys.DOWN);
//			Thread.sleep(2000);
//			from.sendKeys(Keys.DOWN);
//			Thread.sleep(1000);
//			from.sendKeys(Keys.DOWN);
//3)click on last option
		List<WebElement> alloptions = driver.findElements(By.xpath("//li[@class='list']"));
		alloptions.get(alloptions.size()-1).click();






		}
	
}

