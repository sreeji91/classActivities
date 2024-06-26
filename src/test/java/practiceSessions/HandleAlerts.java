package practiceSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
// Normal alert with OK button
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		Alert myAlert=driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();
//Confirmation Alert window:ok and Cancel button
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(3000);
		Alert myAlert1=driver.switchTo().alert();
		System.out.println(myAlert1.getText());
		//myAlert1.accept();
		myAlert1.dismiss();
//prompt alert :with input box ok and cancel
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Thread.sleep(3000);
		Alert myAlert2=driver.switchTo().alert();
		System.out.println(myAlert2.getText());
		myAlert2.sendKeys("hello");
		myAlert2.accept();
		
		//myAlert2.dismiss();
		
	}

}
