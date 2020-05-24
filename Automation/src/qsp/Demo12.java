package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12  {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	                   
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://myaccount.google.com/?utm_source=sign_in_no_continue");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Dimension d = new Dimension(300,200);
		driver.manage().window().setSize(d);
		Point p = new Point(200,400);
		driver.manage().window().setPosition(p);
		
	}

}
