package testNGTestCases;

import org.testng.annotations.Test;

import pageObject.POMwithPageFactory;
import webDriverUtility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class checkBoxTC {
	static WebDriver driver;

	//static String url = "https://selenium.qabible.in/";
	//static String browser = "chrome";
  @Test
  public void checkBox1() throws InterruptedException, IOException {
	  // Normal implimentation
	  
//	  WebElement input_form = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
//		input_form.click();
//		WebElement checkBoxLink=driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[2]/a"));
//		checkBoxLink.click();
	  
		//Page object model without page factory
//	  POMwithoutPageFactory obj1=new POMwithoutPageFactory(driver);
//	  obj1.inputFormClick();
//	  obj1.checkBoxClick();
	  
		//PageObject model with page factory
	  POMwithPageFactory obj1=new POMwithPageFactory(driver);
	  obj1.clickElement();
	  
		
		
		WebElement checkBox1=driver.findElement(By.id("gridCheck"));
		boolean checkBoxStatus=checkBox1.isDisplayed();
		Assert.assertEquals(checkBoxStatus, true);
		boolean checkBoxSelected=checkBox1.isSelected();
		Assert.assertEquals(checkBoxSelected, false);
		checkBox1.click();
	  
  }
  @BeforeTest
  @Parameters({"browser","url"})
  public void beforeTest(@Optional("chrome") String browser, String url) throws InterruptedException {
	
	  DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
