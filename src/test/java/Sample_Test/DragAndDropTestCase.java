package Sample_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import webDriverUtility.DriverManager;

public class DragAndDropTestCase {
	static WebDriver driver;
	static String url = "https://crossbrowsertesting.github.io/drag-and-drop.html";
	static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {
		DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);
//Click and Hold using actions class.
		WebElement from = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		   Actions var = new Actions(driver);
		   var.dragAndDrop(from, to).build().perform();
	
	}

}
