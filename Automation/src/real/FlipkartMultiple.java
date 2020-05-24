package real;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipkartMultiple {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		WebElement src = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		src.sendKeys("laptops");
		List<WebElement> alloptions = driver.findElements(By.xpath("//li[@class='_1va75j']"));
		for(int i=0;i<alloptions.size();i++) {
			System.out.println(alloptions.get(i).getText());
		}
		
		src.sendKeys(Keys.DOWN);
		src.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement dd = driver.findElement(By.xpath("//div[@class='_1YoBfV']/select[@class='fPjUPw']"));
		//dd.click();
		Select sel = new Select(dd);
		Thread.sleep(3000);
		sel.selectByValue("50000");
		//dd.click();
		driver.findElement(By.xpath("//div[@class='_36jUgy']/div[.='Core i3']")).click();
		driver.findElement(By.xpath("//div[@class='_36jUgy']/div[.='HP']")).click();
		driver.findElement(By.xpath("//label/div[.='Dell']")).click();
		driver.findElement(By.xpath("//div[@class='_3xglSm _1iMC4O']/div[.='Operating System']")).click();
		driver.findElement(By.xpath("//label/div[.='Windows 10']")).click();
		driver.findElement(By.xpath("//div[.='HP 14q Core i3 7th Gen - (8 GB/256 GB SSD/Windows 10 Home) 14q-cs0023TU Thin and Light Laptop']")).click();
	}
}


