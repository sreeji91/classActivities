package Sample_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webDriverUtility.DriverManager;

public class CheckBoxTestCase {
	static WebDriver driver;
	static String url="https://selenium.qabible.in/";
	static String browser="chrome";
	public static void main(String[] args) throws InterruptedException {
		DriverManager obj1 = new DriverManager();
		obj1.launchBrowser(url, browser);
		driver = obj1.driver;
		Thread.sleep(4000);
		WebElement input_form = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		input_form.click();
		Thread.sleep(4000);
		WebElement checkBoxLink=driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[2]/a"));
		checkBoxLink.click();
		Thread.sleep(3000);
		WebElement checkBox1=driver.findElement(By.id("gridCheck"));
		boolean checkBoxStatus=checkBox1.isDisplayed();
		if(checkBoxStatus)
		{
			boolean checkBoxSelected=checkBox1.isSelected();
			if(!checkBoxSelected)
			{
				checkBox1.click();
			}
		}
		WebElement message1=driver.findElement(By.id("message-one"));
		String Message_One=message1.getText();
		if(Message_One.contains("Success"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
		

	}

}
