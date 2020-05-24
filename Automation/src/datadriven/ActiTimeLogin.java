package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin implements AutoConts{
	public static void main(String[] args) throws Throwable {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Filelib fil = new Filelib();
		String expectedLoginTitle = fil.getcellData(EXCEL_PATH, "Invalid", 1, 2);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Thread.sleep(2000);
		if(actualTitle.equals(expectedLoginTitle)) {
			System.out.println("login page displayed succefully");
		}
		else {
			System.out.println("failed");
		}
		for(int i=0;i<=5;i++) {
		String un = fil.getcellData(EXCEL_PATH,"Invalid",1,i);
		String pw = fil.getcellData(EXCEL_PATH,"Invalid",1,i);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		}
	}

}
