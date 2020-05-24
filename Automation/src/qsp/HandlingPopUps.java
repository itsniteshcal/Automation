package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("file:///C:/Users/Anup/Desktop/popup.html");
//		WebElement login = driver.findElement(By.xpath("//button[.='Login']"));
//		login.click();
//		Thread.sleep(3000);
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alt.accept();
		driver.get("file:///C:/Users/Anup/Desktop/confirmation%20popup.html");
		WebElement conf = driver.findElement(By.xpath("//button[.=' i love you ']"));
		conf.click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		
		
	}

}
