package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\software_download\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions act= new Actions(driver);
		
		WebElement ele1= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		WebElement ele2= driver.findElement(By.xpath("//span[contains(text(),'Your Wish List')]"));
		
		act.moveToElement(ele1).moveToElement(ele2).doubleClick().build().perform();

	}

}
