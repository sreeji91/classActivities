package testNGTestCases;

import org.testng.annotations.Test;

import excelRead.ExcelRead;
import pageObject.POMlogIn;
import webDriverUtility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class EnterValue {
	POMlogIn objPOMlogIn;
	static WebDriver driver;
	//Using excel read
//  @Test
//  public void f() throws IOException {
//	  String userName=ExcelRead.readStringData(1, 0);
//		
//		String password=ExcelRead.readStringData(1, 1);
//		
//	  objPOMlogIn.logIn(userName,password);
//  }
	
	@Test(priority =1, enabled=true,groups= {"smokeTest"}, dataProvider="testdata")
public void f(String username,String password) throws IOException, InterruptedException {

		objPOMlogIn.logIn(username,password);
 }
	
//	@Test(priority =1, enabled=true,groups= {"smokeTest"}, dataProvider="testdata")
//	public void f(String username,String password) throws IOException, InterruptedException {
//	System.out.println("smoke test");
//	 }
//	
//	@Test(priority =2, enabled=true,groups= {"Regression"} dataProvider="testdata")
//	public void g(String username,String password) throws IOException, InterruptedException {
//	System.out.println("Regression test");
//	 }
	
  @BeforeTest
  @Parameters({"browserTest3","urlTest3"})
  public void beforeTest(@Optional("chrome") String browserTest3, String urlTest3) throws InterruptedException {
	
	  DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(urlTest3, browserTest3);
		driver = obj1.driver;
		Thread.sleep(4000);
		objPOMlogIn=new POMlogIn(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

  @DataProvider(name="testdata")
  public Object[][] TestDataFeed(){

  // Create object array with 2 rows and 2 column- first parameter is row and second is //column
  Object [][] twitterdata=new Object[2][2];

  // Enter data to row 0 column 0
  twitterdata[0][0]="standard_user";
  // Enter data to row 0 column 1
  twitterdata[0][1]="secret_sauce";
  // Enter data to row 1 column 0
  twitterdata[1][0]="problem_user";
  // Enter data to row 1 column 1
  twitterdata[1][1]="secret_sauce";
  // return arrayobject to testscript
  return twitterdata;
  }
  
  
}
