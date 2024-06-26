package practiceSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTableTC {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo3x.opencartreports.com/admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
		userName.clear();
		userName.sendKeys("demo");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//li[@id='menu-customer']/a")).click();
		driver.findElement(By.xpath("//ul[@id='collapse5']//a")).click();
		
		String s1=driver.findElement(By.xpath("//div[text()='Showing 1 to 7 of 7 (1 Pages)']")).getText();
		String value=s1.substring(s1.indexOf("(")+1,s1.indexOf("Pages")-1);
		System.out.println(value);
		int intvalue=Integer.parseInt(value);
	}

}
