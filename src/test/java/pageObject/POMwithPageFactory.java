package pageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverUtility.ActionHandlers;

public class POMwithPageFactory {
	ActionHandlers objHandler;
	WebDriver driver;
	public POMwithPageFactory(WebDriver driver)
	{
	this.driver=driver;
	objHandler=new ActionHandlers(driver);
	PageFactory.initElements(driver, this);                                                                                                                                  
	}
	@FindBy(xpath="//*[@id='collapsibleNavbar']/ul/li[2]/a")
	public WebElement inputForm;
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[2]/a")
	public WebElement checkBox;
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement name;
	@FindBy(xpath="//label[text()='Country:']")
	public WebElement text;
	
	public void clickElement() throws IOException
	{
		objHandler.screenshot();
		objHandler.click(inputForm);
		objHandler.click(checkBox);
		objHandler.screenshot();
	}
	public void elementSendKeys()
	{
		objHandler.sendKeys(name, "sreeji");
	}
	public void readText()
	{
		objHandler.getText(text);
	}
	
}
