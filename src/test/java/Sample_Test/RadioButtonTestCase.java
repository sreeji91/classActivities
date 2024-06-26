package Sample_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webDriverUtility.DriverManager;

public class RadioButtonTestCase {
	static WebDriver driver;
	static String url="https://selenium.qabible.in/";
	static String browser="chrome";
	public static void main(String[] args) throws InterruptedException {
		DriverManager obj1=new DriverManager();
		obj1.launchBrowser(url, browser);
		Thread.sleep(3000);
		driver=obj1.driver;
		WebElement input_form=driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		input_form.click();
		WebElement RadioButtonLink=driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[3]/a"));
		RadioButtonLink.click();
		
		//RadioButtonFemale
		
		WebElement radioButtonFemale=driver.findElement(By.id("inlineRadio2"));
		boolean checkRadioButtonF=radioButtonFemale.isDisplayed();
		if(checkRadioButtonF)
		{
			boolean checkRadiobuttonSelected=radioButtonFemale.isSelected();
			if(!checkRadiobuttonSelected)
			{
				radioButtonFemale.click();
			}
		}
		WebElement buttonShowSelected=driver.findElement(By.id("button-one"));
		buttonShowSelected.click();
		WebElement message_one=driver.findElement(By.id("message-one"));
		String message1_Text=message_one.getText();
		if(message1_Text.contains("Female"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
		
	}
}
