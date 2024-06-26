package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverUtility.ActionHandlers;

public class POMOrangeHRMLogin {
	WebDriver driver;
	ActionHandlers objActionHandler;
	public POMOrangeHRMLogin(WebDriver driver)
	{
		this.driver=driver;
		objActionHandler=new ActionHandlers(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy (name="username")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement logInBtn;
	
	public void login(String UserName,String Password)
	{
		objActionHandler.sendKeys(userName,UserName);
		objActionHandler.sendKeys(password, Password);
		objActionHandler.click(logInBtn);
	}

}
