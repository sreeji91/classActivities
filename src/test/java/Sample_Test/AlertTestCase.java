package Sample_Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webDriverUtility.DriverManager;

public class AlertTestCase {

	static WebDriver driver;

	static String url="https://selenium.qabible.in/";
	static String browser="chrome";
		public static void main(String[] args) throws InterruptedException 
		{
			DriverManager obj1=new DriverManager();
			obj1.launchBrowser(url,browser);
			driver=obj1.driver;
			Thread.sleep(4000);
			
			WebElement alert_modals=driver.findElement(By.id("alert-modal"));
			alert_modals.click();
			WebElement java_Alert=driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[5]/a"));
			java_Alert.click();
			Thread.sleep(4000);
			WebElement prompt_box=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div/div[2]/button"));
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].scrollIntoView();", prompt_box);
			Thread.sleep(4000);
			prompt_box.click();
			String expected_value="test";
			
			//Handling Alerts
			
			Alert objAlert=driver.switchTo().alert();
			objAlert.sendKeys(expected_value);
			Thread.sleep(4000);
			objAlert.accept();
			Thread.sleep(4000);
			//objAlert.dismiss();          //closing the alert message.
			WebElement message=driver.findElement(By.id("prompt-demo"));
			String value=message.getText();
			
			if(value.contains(expected_value))
			{
				System.out.println("passed");
			}
			else {
				System.out.println("Failed");
			}	
		}
}
