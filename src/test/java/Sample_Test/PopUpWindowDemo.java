package Sample_Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import webDriverUtility.DriverManager;

public class PopUpWindowDemo {
	static WebDriver driver;
	static String url = "https://demo.guru99.com/popup.php";
	static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {
		DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		// to
		String MainWindow = driver.getWindowHandle();

		// To handle all new opened window.
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");

				driver.findElement(By.name("btnLogin")).click();

				// Closing the Child Window.
				driver.close();
				// driver.quit();
				driver.switchTo().window(MainWindow);
			}
		}
	}
}
