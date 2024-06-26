package Sample_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webDriverUtility.DriverManager;

public class Test  {
	static WebDriver driver;

	static String url="https://www.saucedemo.com/v1/";
	static String browser="firefox";
		public static void main(String[] args) throws InterruptedException 
		{
			DriverManager obj1=new DriverManager();
			obj1.launchBrowser(url,browser);
			driver=obj1.driver;
			Thread.sleep(4000);
			WebElement username=driver.findElement(By.id("user-name"));
			username.sendKeys("standard_user");
			Thread.sleep(4000);
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys("secret_sauce");
			Thread.sleep(4000);
			WebElement login=driver.findElement(By.id("login-button"));
			login.click();
			Thread.sleep(4000);
			String homeUrl="https://www.saucedemo.com/v1/inventory.html";
			String currentUrl=driver.getCurrentUrl();
			if(homeUrl.equalsIgnoreCase(currentUrl))
			{
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}
			obj1.closeBrowser();
			
		}

}
