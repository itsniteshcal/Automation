package real;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandel {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		 Set<String> windowids = driver.getWindowHandles();
		 ArrayList<String> tab=new ArrayList<>(windowids);	
		 driver.switchTo().window(tab.get(1));
		 System.out.println(driver.getTitle());
		// driver.close();
		 driver.switchTo().window(tab.get(0));
		
	}

}
