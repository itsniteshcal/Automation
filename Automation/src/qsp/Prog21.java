package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog21 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anup/Desktop/Moption.html");
		WebElement ddAddr = driver.findElement(By.id("taj"));
		Select sel = new Select(ddAddr);
		if(sel.isMultiple())
			System.out.println("yes multi");
		else
			System.out.println("not a multi");
		
//	 	for(int i=0;i<=3;i++)
//		{
//			sel.selectByIndex(i);
//			Thread.sleep(1000);
//		}
//		Thread.sleep(2000);
//	List<WebElement> alloption = sel.getOptions();
//		System.out.println(alloption.size());
//		for(int i=alloption.size()-1;i>=0;i++)
//			sel.selectByIndex(i);
//		Thread.sleep(1000);
//		for(int i=0;i<=alloption.size();i++)
//			sel.deselectByIndex(i);
//		Thread.sleep(1000);
//		List<WebElement> alloptions = sel.getOptions();
//		for(int i=0;i<=alloptions.size();i++) {
//			System.out.println(alloptions.get(i).getText());
		//selecting 1st four options of a dd
		for(int i=2;i<=5;i++) {
			sel.selectByIndex(i);
		Thread.sleep(1000);}
		List<WebElement> allseop = sel.getAllSelectedOptions();
		System.out.println(allseop.size());
	//First selected option
		WebElement firseopt = sel.getFirstSelectedOption();
		System.out.println(firseopt.getText());
		WebElement ele = sel.getWrappedElement();
		System.out.println(ele.getText());
		
		
		}
			


	}
