package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Option {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anup/Desktop/selenium/option.html");
		Thread.sleep(3000);
		WebElement ddAddr = driver.findElement(By.id("taj"));
		Select sel=new Select(ddAddr);//parameterized constructor
		if(sel.isMultiple())
			System.out.println("it is multi select dd");
		else
			System.out.println("it is not multi select dd");
		sel.selectByVisibleText("Biryani");
	//	sel.selectByIndex(6);
		//sel.selectByValue("8"); 
		//sel.deselectByVisibleText("Biryani");
		//sel.deselectAll();

	}

}
