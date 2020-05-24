package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	//	String url = driver.getCurrentUrl();
//		System.out.println("url is:"+url);
	//	String ps = driver.getPageSource();
		//System.out.println("Page source is: "+ps);
	//	String title = driver.getTitle();
		//System.out.println(title);
	//	if(title.equals("actiTIME - Login")) {
	//		System.out.println("test passed");
		//	}else {
		//		System.out.println("test failed");
			//}
		
		
		
	}

}
