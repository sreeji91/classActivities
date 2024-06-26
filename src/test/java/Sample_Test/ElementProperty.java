package Sample_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webDriverUtility.DriverManager;

public class ElementProperty {
	static WebDriver driver;

	static String url = "https://selenium.qabible.in/";
	static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {
		DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);
		WebElement alert_modals=driver.findElement(By.id("alert-modal"));
		boolean value=alert_modals.isDisplayed();
		if(value)
		{
			alert_modals.click();
		}
		
	}

}
