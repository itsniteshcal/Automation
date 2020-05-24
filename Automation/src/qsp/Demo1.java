package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("enter browserName");
		Scanner sc= new Scanner(System.in);
		String browserName = sc.next();
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		//	String url=driver.getCurrentUrl();
		//	System.out.println("URL IS:"+url);
			//String src=driver.getPageSource();
		
		//System.out.println("the pageSource is: "+ src);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("This is my title"))
			{
				System.out.println("passed");
			}
			else
				
			{
				System.out.println("failed");
			driver.close();
		
	
		
			}
		}
		
		
	}
}


