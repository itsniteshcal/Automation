package real;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowserWindowPopup {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
//		Set<String> allwhs = driver.getWindowHandles();
//		System.out.println(allwhs);
//		for(String str:allwhs) {
//			driver.switchTo().window(str).close();
//			
//		}
//		String ntitle = driver.getTitle();
//		Set<String> allwhs = driver.getWindowHandles();
//		for (String str : allwhs) {
//			String title = driver.switchTo().window(str).getTitle();
//		
//			if(!title.equals(ntitle)) {
//				driver.close();
//				
//			}
//			
//			
//		}
		Set<String> allwhs = driver.getWindowHandles();
		for (String st : allwhs) {
			String alltitle = driver.switchTo().window(st).getTitle();
						if(alltitle.equals("Fujitsu")){
				driver.close();
						}		
		}
		
			
		}
			
		}
	
    	  
      
		
