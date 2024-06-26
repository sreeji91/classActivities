package webDriverUtility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionHandlers {
	WebDriver driver;
	DriverManager  obj=new DriverManager ();
	public ActionHandlers(WebDriver driver2) {
		this.driver=driver2;
	}
	// POM without page factory
	public void click(By value)
	{
		driver.findElement(value).click();
	}
	
	public void sendKeys(By value,String message)
	{
		driver.findElement(value).sendKeys(message);
	}
	
	public void getText(By value)
	{
		String s=driver.findElement(value).getText();
		System.out.println(s);
	}
	
	
	//POM with page factory
	public void click(WebElement element)
	{
		element.click();
	}
	public void sendKeys(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	public void clear(WebElement element)
	{
		element.clear();
	}
	public void getText(WebElement element)
	{
		String s1=element.getText();
		System.out.println(s1);
	}
	public void screenshot() throws IOException
	{
		//Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        
        /*DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
        Date date = new Date();
        */
        //or alternate method using Calendar class
       
         Calendar cal=Calendar.getInstance();
         Date time=cal.getTime();
         String timestamp=time.toString().replace(":","").replace(" ", "");
         
        

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                //File DestFile=new File("C:\\Users\\lenovo\\eclipse-workspace\\Automation\\src\\test\\resources\\screenShot\\test_"+dateFormat.format(date)+".png");
                File DestFile=new File("C:\\Users\\lenovo\\eclipse-workspace\\Automation\\src\\test\\resources\\screenShot\\test_"+timestamp+".png");

                //Copy file at destination
FileUtils.copyFile(SrcFile, DestFile);
	}

}


/**
 * Take window screeshot
 * @param fileName
 * @return null
 * @throws IOException 
 */

