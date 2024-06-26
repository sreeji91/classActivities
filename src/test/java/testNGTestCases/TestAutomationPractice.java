package testNGTestCases;

import org.testng.annotations.Test;

import pageObject.POMwithPageFactory;
import webDriverUtility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TestAutomationPractice {
	static WebDriver driver;

	static String url = "https://testautomationpractice.blogspot.com/";
	static String browser = "chrome";
  @Test
  public void f() {
	  /*pOM without page factory
	  POMwithoutPageFactory obj1=new POMwithoutPageFactory(driver);
	  obj1.maleClick();
	  obj1.valueEnter();
	  obj1.readText();*/
	  
	  //POM with page factory
	  POMwithPageFactory obj1=new POMwithPageFactory(driver);
	  obj1.elementSendKeys();
	  obj1.readText();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
