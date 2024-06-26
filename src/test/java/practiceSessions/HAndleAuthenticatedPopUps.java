package practiceSessions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HAndleAuthenticatedPopUps {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

	}

}
