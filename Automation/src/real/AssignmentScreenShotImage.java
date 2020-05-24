package real;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class AssignmentScreenShotImage {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement srch = driver.findElement(By.name("q"));
		
		srch.sendKeys("nitish kumar");
		List<WebElement> nitimg = driver.findElements(By.xpath("//ul[@class='erkvQe']"));
		for(int i=0;i<nitimg.size();i++) {
			System.out.println(nitimg.get(i).getText());
		}
		//srch.sendKeys(Keys.DOWN);
//		srch.sendKeys(Keys.ENTER);
//		driver.findElement(By.linkText("Images")).click();
//		WebElement nit = driver.findElement(By.xpath("//img[contains(@alt,'Coronavirus Lockdown: Ease Travel Restrictions, Will Bring ...')]"));
//		File from = nit.getScreenshotAs(OutputType.FILE);
//		File to = new File("G:\\seleniumScreenshot\\nit.pdf");
//		Files.copy(from, to);


	}

}
