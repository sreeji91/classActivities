package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import webDriverUtility.ActionHandlers;

public class POMwithoutPageFactory {
	
	ActionHandlers objHandler;
	public POMwithoutPageFactory(WebDriver driver)
	{
	
	 objHandler=new ActionHandlers(driver);
	}
	By inputForm=By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a");
	By checkBox=By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[2]/a");
	
	By name=By.xpath("//input[@id='name']");
	By email=By.xpath("//input[@id='email']");
	By gender_male=By.xpath("//input[@id='male']");
	By text=By.xpath("//label[text()='Country:']");
	
	
	public void inputFormClick() throws IOException
	{
		objHandler.screenshot();
		objHandler.click(inputForm);
	}
	public void checkBoxClick()
	{
		objHandler.click(checkBox);
	}
	public void maleClick()
	{
		objHandler.click(gender_male);
	}
	public void valueEnter()
	{
		objHandler.sendKeys(name, "sreeji");
		objHandler.sendKeys(email, "dummyme@gmail.com");
	}
	public void readText()
	{
		objHandler.getText(text);
	}
}
