package real;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartPriceSelection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("mobiles");
		Thread.sleep(1000);

		List<WebElement> list = driver.findElements(By.xpath("//li[contains(@class,'Wbt_B2')]"));
		System.out.println(list.size());
		Thread.sleep(4000);
		search.sendKeys(Keys.DOWN);
		search.sendKeys(Keys.DOWN);
		search.sendKeys(Keys.ENTER);
	List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		for(int i=0;i<prices.size();i++)
			System.out.println(prices.get(i).getText());
		List<WebElement> mob = driver.findElements(By.xpath("//ul[@class='col-12-12 _1PBbw8']/li/div/a/div/span[@class='_3Wn9Gb' and contains(text(),'')]"));
		int size=mob.size();
		for(int i=0;i<size;i++) {
			String text = mob.get(i).getText();
			System.out.println(text);
		}
		
	}

}

