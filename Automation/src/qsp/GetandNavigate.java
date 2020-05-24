package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandNavigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?service=accountsettings&hl=en-US&continue=https%3A%2F%2Fmyaccount.google.com%2Fintro&csig=AF-SEnZvb1ubYGmts8iI%3A1588268934&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}
}
