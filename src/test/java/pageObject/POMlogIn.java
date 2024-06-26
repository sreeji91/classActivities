package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverUtility.ActionHandlers;

public class POMlogIn {
	ActionHandlers objHandler;
	WebDriver driver;
	public POMlogIn(WebDriver driver)
	{
	this.driver=driver;
	objHandler=new ActionHandlers(driver);
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-name")
	public WebElement Webusername;
	@FindBy(name="password")
	public WebElement Webpassword;
	@FindBy(id="login-button")
	public WebElement WebLoginBtn;
	@FindBy (xpath="//button[text()='Open Menu']")
	public WebElement menu_btn;
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	public WebElement logout;
	
	
	public void logIn(String userName,String password) throws InterruptedException
	{
		objHandler.sendKeys(Webusername, userName);
		objHandler.sendKeys(Webpassword,password );
		objHandler.click(WebLoginBtn);
		Thread.sleep(5000);
		objHandler.click(menu_btn);
		objHandler.click(logout);
		Thread.sleep(5000);
		
		
		
		
	}
	
}
