package testNGTestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import webDriverUtility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DropdownTC {
	static WebDriver driver;

	//static String url = "https://selenium.qabible.in/";
	//static String browser = "chrome";
  @Test(priority = 1 ,enabled=true)
  public void dropdown1() throws InterruptedException {
	  WebElement input_form = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		input_form.click();
		Thread.sleep(4000);
		WebElement select_input = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[4]/a"));
		select_input.click();
		Thread.sleep(4000);
		
		WebElement dropDown = driver.findElement(By.id("single-input-field"));
		Select objSelect = new Select(dropDown);
		objSelect.selectByIndex(1);
		Thread.sleep(4000);
		objSelect.selectByValue("Yellow");
		Thread.sleep(4000);
		objSelect.selectByVisibleText("Green");
		Thread.sleep(4000);
		for (int k = 0; k <= 3; k++) {
			objSelect.selectByIndex(k);
				Thread.sleep(4000);
			}
		List<WebElement> list_elements = objSelect.getOptions();
		for (int i = 0; i < list_elements.size(); i++)
		{
			String value = list_elements.get(i).getText();
			System.out.println(value);
			list_elements.get(i).click();
		}
  }
  @Test(priority = 2)
  public void dropdown2() throws InterruptedException {
	  WebElement dropdown2 = driver.findElement(By.id("multi-select-field"));
		Select objSelect1 = new Select(dropdown2);
		objSelect1.selectByIndex(0);
		objSelect1.selectByIndex(1);
		WebElement getAllSelectedBtn = driver.findElement(By.id("button-all"));
		getAllSelectedBtn.click();
		String expected_val = "Red,Yellow";
		WebElement message = driver.findElement(By.id("message-two"));
		String actual_val = message.getText();
		//Hard Assert
		Assert.assertEquals(actual_val, expected_val);
		
		//Soft Assert
		SoftAssert objAssert=new SoftAssert();
		objAssert.assertEquals(actual_val, expected_val);
		System.out.println("Hello world");
		objAssert.assertAll();
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
