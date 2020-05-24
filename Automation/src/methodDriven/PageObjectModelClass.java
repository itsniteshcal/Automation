package methodDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelClass {
	//Declaration
	//@FindBy(locatorName="locatorValue") AccessSpecifier ReturnType ElementName
	@FindBy(id="username") private WebElement unTB;
	@FindBy(name="pwd") private WebElement pwTB;
	@FindBy(xpath="//div[.='Login '] ") private WebElement loginBtn;
	@FindBy(xpath="//a") private WebElement allLinks;
	
	//Initialization
	//take constructor
	public PageObjectModelClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	//address of username textbox
	public WebElement getUntb() {
		return unTB;
		}
	
	//type data into username
	public  void setUsername(String un) {
		unTB.sendKeys(un);
	}
	public WebElement getPwTB() {
		return pwTB;
	}
	public void setPwTB(String pwd) {
		pwTB.sendKeys(pwd);
		
	}
	public WebElement Loginbtn() {
		return loginBtn;
		
	}
	public void countallLinks() {
		System.out.println(allLinks);
		
	}
	public void clickLoginbtn() {
		loginBtn.click();
		
	}
	public void loginToApp(String un,String pwd) {
		unTB.sendKeys(un);
		pwTB.sendKeys(pwd);
		loginBtn.click();
		
		
	}
	
	

}
