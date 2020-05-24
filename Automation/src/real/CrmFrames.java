package real;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrmFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.get("https://ui.freecrm.com/");
//		driver.findElement(By.name("email")).sendKeys("shubham.skr.101@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("12Feb@1996");
//		driver.findElement(By.xpath("//div[.='Login'and @class='ui fluid large blue submit button']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='main-nav']//a[contains(@href,'contacts')]")).click();
		driver.get("https://www.w3schools.com/html/html_forms.asp");
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("abc");
			
		
		
		

}
}