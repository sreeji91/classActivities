package Sample_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webDriverUtility.DriverManager;

public class FramesDemo {

	static WebDriver driver;
	static String url = "https://www.w3schools.com/html/html_iframe.asp";
	static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {
		DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);
		WebElement frameElement=driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/iframe"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[3]")).click();
		
		List<WebElement> value=driver.findElements(By.tagName("iframe"));
		System.out.println(value.size());
	}

}
