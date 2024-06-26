package practiceSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//multiple tables
		//List <WebElement> list1=driver.findElements(By.tagName("tr"));// single table
	
		
		//findout total columns of a table
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td")).size();
		
		//Read data from specific row and column(row=5 and column=1
		//String bookName1=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
		//System.out.println(bookName1);
		//Read the data from all the rows and columns
		/*for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++ )
			{
				String s=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(s+"   ");
			}
			System.out.println();
		}*/
		//conditional based: print books written by mukesh
		for(int r=2;r<=rows;r++)
		{
			String autherName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			if(autherName.equals("Mukesh"))
			{
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(bookName+"\t"+autherName);
			}
		}
		
		//Read the price of all the books and find total
		int total=0;
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		System.out.println("Total price= "+total);
		}

}
