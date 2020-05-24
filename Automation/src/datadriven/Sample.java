package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample implements AutoConts {
	//public class ActiTimeInvalidLoginTest1 implements AutoConts {
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty(CHROME_KEY,  CHROME_VALUE);
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("un");
			driver.findElement(By.name("pwd")).sendKeys("pswd");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Thread.sleep(4000);
			WebElement element =driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]"));
			System.out.println(element.getText());
			Thread.sleep(4000);
			//driver.close();
			if(element.isDisplayed()) {
				System.out.println("yes");
				
			}
			else {
				System.out.println("no");
			}
				

}
}