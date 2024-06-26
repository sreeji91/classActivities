package practiceSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
//select single option
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul/li[8]/a/label/input")).click();
//Capture all options and findout the size
	List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	System.out.println(options.size());
	/*for(WebElement op:options)
	{
		System.out.println(op.getText());
	}*/
//Select multiple options
	for(WebElement op:options)
	{
		String option=op.getText();
		if(option.equals("Java") || option.equals("Python"))
		{
			op.click();
		}
	}
	}

}
