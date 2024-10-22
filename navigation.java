package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\software_download\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("java");
		ele.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		driver.navigate().refresh();
	}

}
