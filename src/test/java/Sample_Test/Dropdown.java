package Sample_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import webDriverUtility.DriverManager;

public class Dropdown {
	static WebDriver driver;

	static String url = "https://selenium.qabible.in/";
	static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {
		DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);
		
		WebElement input_form = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		input_form.click();
		Thread.sleep(4000);
		WebElement select_input = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[4]/a"));
		select_input.click();
		Thread.sleep(4000);
//		WebElement dropDown = driver.findElement(By.id("single-input-field"));
//		Select objSelect = new Select(dropDown);
//		objSelect.selectByIndex(1);
//		Thread.sleep(4000);
//		objSelect.selectByValue("Yellow");
//		Thread.sleep(4000);
//		objSelect.selectByVisibleText("Green");
//		Thread.sleep(4000);
//		for (int k = 0; k <= 3; k++) {
//			objSelect.selectByIndex(k);
//			Thread.sleep(4000);
//		}
//		List<WebElement> list_elements = objSelect.getOptions();
//		for (int i = 0; i < list_elements.size(); i++) {
//			String value = list_elements.get(i).getText();
//			System.out.println(value);
//			list_elements.get(i).click();
//		}
		// Handling multiple dropdowns
		WebElement dropdown2 = driver.findElement(By.id("multi-select-field"));
		Select objSelect1 = new Select(dropdown2);
		objSelect1.selectByIndex(0);
		objSelect1.selectByIndex(1);
		WebElement getAllSelectedBtn = driver.findElement(By.id("button-all"));
		getAllSelectedBtn.click();
		String expected_value = "Red,Yellow";
		WebElement message = driver.findElement(By.id("message-two"));
		String actual_value = message.getText();

//		if(actual_value.contains(expected_value))
//		{
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}

		String a[] = actual_value.split(":");
		System.out.println(a[1]);
		if (a[1].equalsIgnoreCase(expected_value)) 
		{
			System.out.println("passed");
		} 
		else 
		{
			System.out.println("failed");

		}

	}

}
