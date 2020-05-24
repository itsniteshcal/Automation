package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public static void main(String[] args) {
		WebDriver driver = null;
		System.out.println("enter browser name");
		Scanner sc = new Scanner(System.in);
		String browserName=sc.next();
		System.out.println("wait maadi");
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver= new FirefoxDriver();
			
		}
		else {
			System.out.println("enter correct browser name");
			
		}
		driver.get("https://www.google.com/");
		sc.close();
			
	}

}
