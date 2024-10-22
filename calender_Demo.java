package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender_Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\software_download\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ksrtc.in/");
		
		driver.findElement(By.id("imgDepartDate")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'29')]")).click();
		
		
	}

}
