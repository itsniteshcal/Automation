package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Anup/Desktop/DynamicWebTable.html");
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='t1']//tr"));
		System.out.println("Total rows on Webpage: "+allrows.size());
		
		 List<WebElement> fifthColumn = driver.findElements(By.xpath("//tr//td[5]"));
		System.out.println(fifthColumn.size());
	}

}
