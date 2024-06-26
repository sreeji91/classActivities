package practiceSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerTC {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch the frame
		driver.switchTo().frame(0);
		//Using sendKeys method
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/06/2024");//mm/dd/yyyy
	
		//Method 2 using date picker
		String year="2025";
		String month="June";
		String day="07";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(current_month);
		String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(current_year);
		
		while(true)
		{
			if(current_month.equals(month) && current_year.equals(year))
			{
				System.out.println("matching");
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			}
		}
		
	}

}
