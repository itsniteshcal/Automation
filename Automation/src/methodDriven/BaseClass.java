package methodDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass implements AutoConts {
	public static WebDriver driver;
	public void openBrowser() throws Throwable {
		FileLib12 flib = new FileLib12();
		String browserValue = flib.getPropKey(PROP_PATH, "browser");
		if(browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
		//	String url = flib.getPropKey(PROP_PATH, "url");
			
		}
		else if(browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("invalid browser");
		}
		
		String url = flib.getPropKey(PROP_PATH, "url");
		driver.get(url);
		
		
	}
	public void closeBrowser() {
		driver.close();
		
		
		
		
	}

}
