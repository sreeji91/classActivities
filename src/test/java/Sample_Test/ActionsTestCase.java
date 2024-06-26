package Sample_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import webDriverUtility.DriverManager;

public class ActionsTestCase {
	static WebDriver driver;
	static String url = "https://selenium.qabible.in/";
	static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {
		DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);
//Click and Hold using actions class.
		WebElement clickable = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		   Actions var = new Actions(driver);
		   //var.clickAndHold(clickable).release().build().perform();
//Right click
		  //var.contextClick(clickable).build().perform();
//Double click
		  //var.doubleClick(clickable).build().perform();
//Move to Element
		   //var.moveToElement(clickable).build().perform();

		   
	}

}
