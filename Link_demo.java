package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\software_download\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		WebElement lnk= driver.findElement(By.linkText("Forgotten password?"));
//		lnk.click();
	
//		WebElement lnk=driver.findElement(By.partialLinkText(" password?"));
//		lnk.click();
		
		WebElement lnk=driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
		lnk.click();
	}

}
