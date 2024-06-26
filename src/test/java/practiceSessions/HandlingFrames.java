package practiceSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
//passed frame as webelement
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("Welcome");
//Switching back to the page
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
//Switching to frame2
		driver.switchTo().frame(frame2);//Switching to frame2
		driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("Hello");
//Switching back to the page
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
//Switching to frame3
		driver.switchTo().frame(frame3);
//interact with inner iframe
		driver.switchTo().frame(0);//switching to frame using index(only one frame inside)
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
//Switching back to the page
				driver.switchTo().defaultContent();
	}

}
