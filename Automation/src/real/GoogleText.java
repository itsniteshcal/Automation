package real;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement qspider = driver.findElement(By.name("q"));
		qspider.sendKeys("Qspider");
		Thread.sleep(5000);
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='sbtc']"));
		for(int i=0;i<alloptions.size();i++) {
			 String text = alloptions.get(i).getText();
			if(text.equals("qspider old airport road")) {
				alloptions.get(i).click();
				
			}
				
		}
		
		
		
		
		
		
	}

}
