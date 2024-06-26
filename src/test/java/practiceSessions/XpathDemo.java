package practiceSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//Absolute xpath for SELENIUM element
		//driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/nav/div/div/ul/li/a")).click();
		//Relative Xpath for testing element
		//driver.findElement(By.xpath("//div[@class='featured-box cloumnsize1']//h4//b")).click();
		//Relative xpath for SELENIUM element
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a")).click();
		//Basic Xpath for user ID
		//driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("ADMIN");
		//driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/insurance/v1/index.php']")).click();
		//Contains() Method
	}

}
