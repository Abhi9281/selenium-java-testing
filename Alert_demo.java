package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_download\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ksrtc.in/");
		
		//driver.manage().window().maximize();
		driver.findElement(By.id("submitSearch")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

	}

}
