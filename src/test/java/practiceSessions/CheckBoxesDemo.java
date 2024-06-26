package practiceSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select a specific checkbox:
		//driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();
		//To select multiple checkboxes
		List <WebElement> checkBoxs=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		for(int i=0; i<checkBoxs.size();i++)
		{
			checkBoxs.get(i).click();
		}
		/*for(WebElement i:checkBoxs)
		{
			i.click();
		}*/
		//last 3 checkboxes
//		for(int i=4;i<checkBoxs.size();i++)
//		{
//			checkBoxs.get(i). click();
//		}
		//Unselect checkboxes
		Thread.sleep(4000);
		for(int i=0; i<checkBoxs.size();i++)
		{
			if(checkBoxs.get(i).isSelected())
			{
			checkBoxs.get(i).click();
			}
		}
	}

}
