package practiceSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello");
		//javascript executor alternate method for sendKeys
		WebElement inputBox=driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','John')",inputBox);
		
		//driver.findElement(By.xpath("//input[@id='male']")).click();
		
		WebElement male_btn=driver.findElement(By.xpath("//input[@id='male']"));
		//js.executeScript("arguments[0].click()", male_btn);
		
		//Scrolling the page by pixel number
		//js.executeScript("window.scrollBy(0,2000)","");
		//scrooling till an element
		//js.executeScript("arguments[0].scrollIntoView()", male_btn);
		
		//Scrolling till the end
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//Scrolling up
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		//Minimize the page
		//driver.manage().window().minimize();
		
		//Setting the zoom level
		//js.executeScript("document.body.style.zoom='50%'");
	}

}
