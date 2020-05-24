package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledIsSelectedIsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.xpath("Login "));
		WebElement remMeCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		remMeCheckBox.click();
		Thread.sleep(3000);
		if(remMeCheckBox.isDisplayed()) {
			System.out.println("remMeCheckBox is displayed==>pass");

			if(remMeCheckBox.isEnabled()) {
				System.out.println("remMeCheckBox is enabled");

				if(remMeCheckBox.isSelected()) {
					System.out.println("remMeCheckBox is selected");
					remMeCheckBox.click();
				}

					else {
						System.out.println("remMeCheckBox is not selected");
					}}
				else {
					System.out.println("remMeCheckBox is diabled");
				}}
			else {
				System.out.println("remMeCheckBox is not displayed");


			

			}

		}
}