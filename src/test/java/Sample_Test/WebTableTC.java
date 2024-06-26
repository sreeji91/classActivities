package Sample_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webDriverUtility.DriverManager;

public class WebTableTC {

	static WebDriver driver;
	static String url = "https://selenium.qabible.in/";
	static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {
		DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);

		WebElement table = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[4]/a"));
		table.click();
		WebElement tableFilter = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[3]/a"));
		tableFilter.click();
		// WebElement tableName =driver.findElement(By.xpath("//table[@id='example']/tbody/tr[3]/td[1]"));
		// String expectedName="Ashton Cox";
		// System.out.println(tableName.getText());
		for (int i = 1; i <= 10; i++) {
			WebElement tableName = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]"));
			System.out.println(tableName.getText());
			if (tableName.getText().contains("Ashton Cox")) {
				System.out.println("passed");
				break;
			} else {
				Thread.sleep(3000);
				WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
				if (next.isEnabled()) {
					next.click();
					continue;
				}

			}
		}

	}

}
