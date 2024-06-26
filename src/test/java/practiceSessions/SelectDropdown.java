package practiceSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select objselect=new Select(dropdown);
//To select an option from the dropdown
		
		objselect.selectByVisibleText("France");
		objselect.selectByIndex(3);
		objselect.selectByValue("france");
//to capture all the options from the dropdown
		List<WebElement> options=objselect.getOptions();
		System.out.println(options.size());
		
//Printing the options using normal for loop
		/*for(int i=0;i<options.size();i++)
		{
			String option=options.get(i).getText();
			System.out.println(option);
		}*/
//Using enhanced for loop
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	}

}
