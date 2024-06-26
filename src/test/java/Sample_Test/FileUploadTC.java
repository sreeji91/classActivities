package Sample_Test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webDriverUtility.DriverManager;

public class FileUploadTC {

	static WebDriver driver;
	static String url = "https://blueimp.github.io/jQuery-File-Upload/";
	static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {
		DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);

		WebElement addFile = driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div/div[1]/span[1]"));
		addFile.click();
		Thread.sleep(3000);
		uploadFile("C:\\Users\\lenovo\\Desktop\\Actions.png");
	}

	public static void uploadFile(String fileLocation) {
		try {
			// Setting clipboard with file location
			StringSelection stringSelection = new StringSelection(fileLocation);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			// native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}
