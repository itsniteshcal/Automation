package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDuplicates {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Anup/Desktop/Moption.html");
			//WebElement ddAddr = driver.findElement(By.id("taj"));
		//		Select sel=new Select(ddAddr);
		//		List<WebElement> alloptions = sel.getOptions();
		//		for(int i=0;i<alloptions.size();i++)
		//		{
		//		String text = alloptions.get(i).getText();
		//	System.out.println(text);
		//	}
		//	print all the options without duplicate
		//driver.get("file:///C:/Users/Anup/Desktop/Moption.html");
		//WebElement ddAddr = driver.findElement(By.id("taj"));
//		Select sel=new Select(ddAddr);
//		List<WebElement> alloption = sel.getOptions();
//		Set <String> s=new HashSet<String>();
//		for(int j=0;j<alloption.size();j++)
//		{
//			String text = alloption.get(j).getText();
//			s.add(text);
//		}
//		for (String str : s) {
//			System.out.println(str);
//				}
//			WebElement ddAddr = driver.findElement(By.id("taj"));
//			Select sel=new Select(ddAddr);
//			List<WebElement> alloptions = sel.getOptions();
//			LinkedHashSet<String> s = new LinkedHashSet<String>();
//			for(int i=0;i<alloptions.size();i++) {
//				String text = alloptions.get(i).getText();
//				s.add(text);
//			}
//			for (String val : s) {
//				System.out.println(val);
//				
//			}
		  driver.get("file:///C:/Users/Anup/Desktop/Moption.html");
		 WebElement ddAddr = driver.findElement(By.id("taj"));
			Select select=new Select(ddAddr);
			List<WebElement> alloption = select.getOptions();
			Set <String> t=new TreeSet<String>();
			for(int i=0;i<alloption.size();i++)
			{
			String text = alloption.get(i).getText();
			t.add(text);
			}
			for (String st : t) {
				System.out.println(st);
				
			}
			
			
			
			
			
			
			
			
			
			
		
		



	}

}
