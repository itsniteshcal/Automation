package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLoginTest1 implements AutoConts {
	static WebElement element;
	public static void main(String[] args) throws Throwable {
		System.setProperty(CHROME_KEY,  CHROME_VALUE);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		FileLib1 call = new FileLib1();
		String expectedLoginTitle = call.getCellData(EXCEL_PATH,"Invalid",2,2);
		String actualLoginTitle = driver.getTitle();
		System.out.println(actualLoginTitle);
		if(actualLoginTitle.equals(expectedLoginTitle)) {
			System.out.println("TEST==>PASS");
		}
		else {
			System.out.println("TEST==>FAIL");
		}
		//Dynamically getting the last
		int rw = call.getRowCount(EXCEL_PATH, "Invalid");
		for(int i=1;i<=rw;i++) {
			String un = call.getCellData(EXCEL_PATH, "Invalid",i,0);
			String pswd = call.getCellData(EXCEL_PATH, "Invalid",i,1);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pswd);
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Thread.sleep(4000);
			WebElement errMsg =driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
			System.out.println(errMsg.getText());
			
			
		}
		
		Thread.sleep(2000);
		WebElement errMsg =driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
			//WebElement element =driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]"));
			//System.out.println(errMsg.getText());
			if(errMsg.isDisplayed()) 
			{
				System.out.println("errorMsg: "+errMsg.getText()+ "is displayed==>pass");
			}
			else
			{
				System.out.println("errorMsg: "+errMsg.getText()+ "is not displayed==>fail");
				
			}
				
				
				
			}
}
		
		
