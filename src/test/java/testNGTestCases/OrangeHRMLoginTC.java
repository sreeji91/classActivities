package testNGTestCases;

import org.testng.annotations.Test;

import pageObject.POMOrangeHRMLogin;
import webDriverUtility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class OrangeHRMLoginTC {
	static WebDriver driver;
	static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String browser="chrome";
	
	POMOrangeHRMLogin objOrangeHRM;
	
//  @Test(dataProvider = "testdata1")
//  public void f(String UserName,String Password) {
//	  objOrangeHRM=new POMOrangeHRMLogin(driver);
//	  objOrangeHRM.login(UserName,Password);
//	  
//  }
  
  @Test
  @Parameters({"UserName","password"})
  public void f(String UserName,String password) {
	  objOrangeHRM=new POMOrangeHRMLogin(driver);
	  objOrangeHRM.login(UserName,password);
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  DriverManager objDriverManager=new DriverManager();
	  objDriverManager.launchBrowser(url, browser);
	  driver=objDriverManager.driver;
	  
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }
  @DataProvider (name="testdata1")
  public Object[][] TestDataFeed(){

	  // Create object array with 2 rows and 2 column- first parameter is row and second is //column
	  Object [][] OrangeHRMLogin=new Object[1][2];
	// Enter data to row 0 column 0
	  OrangeHRMLogin[0][0]="Admin";
	  // Enter data to row 0 column 1
	  OrangeHRMLogin[0][1]="admin123";
	  return OrangeHRMLogin;

}
}
