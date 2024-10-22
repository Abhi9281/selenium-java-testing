package Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\software_download\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		System.out.println("Title of page: " +title);
		if(title.matches("Facebook – log in or sign up"))
		{
			System.out.println("Valid app...");
		}
		else
			System.out.println("Invalid app Launched...");
		
		System.out.println("The URL is: "+driver.getCurrentUrl());
		
		driver.close();
	}

}
