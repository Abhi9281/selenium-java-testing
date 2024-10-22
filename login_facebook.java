package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\software_download\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//enter the email
		/*WebElement Unm =driver.findElement(By.id("email"));
		Unm.sendKeys("abhi@123gmail.com");
		*/
		
		driver.findElement(By.id("email")).sendKeys("abhishek");  //in short
		
		//enter the password
		WebElement pwd= driver.findElement(By.id("pass"));
		pwd.sendKeys("test");
		
		Thread.sleep(1000);
		
		//find the login
		WebElement Log= driver.findElement(By.name("login"));
		Log.click();
	}

}
