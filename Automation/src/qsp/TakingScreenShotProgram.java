package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakingScreenShotProgram {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//1.) Take ScreenShot through TypeCasting
		//		TakesScreenshot srcsht = (TakesScreenshot)driver;
		//		File from = srcsht.getScreenshotAs(OutputType.FILE);
		//		File to = new File("G:\\seleniumScreenshot\\nit.png");
		//		Files.copy(from, to);
		//2.)DownCasting
//				RemoteWebDriver scsh=(RemoteWebDriver)driver;
//				File from = scsh.getScreenshotAs(OutputType.FILE);
//				File to = new File("G:\\seleniumScreenshot\\sc.jpeg");
			//	Files.copy(from, to);
	//	  3.)EventFiring
//				EventFiringWebDriver efw = new EventFiringWebDriver(driver);
//				File from = efw.getScreenshotAs(OutputType.FILE);
//				File to = new File("G:\\seleniumScreenshot\\screenshot.pdf");
//				Files.copy(from, to);
		//4.)ScreenShot of particular element
//		WebElement ele = driver.findElement(By.name("q"));
//		File from = ele.getScreenshotAs(OutputType.FILE);
//	    File to = new File("G:\\seleniumScreenshot\\scsrh.pdf");
//	    Files.copy(from, to);
		
		

	}

}
