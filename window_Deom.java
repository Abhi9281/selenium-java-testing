package Auto;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class window_Deom {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","D:\\software_download\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Actions act=new Actions(driver);
		
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("terms-link")));

		WebElement terms = driver.findElement(By.id("terms-link"));
		terms.click();
		
		Set<String> win=driver.getWindowHandles();
		System.out.println("count Windows: "+win.size());
		
		for(String e: win) {
			if(e.matches(mainId)) {
			driver.switchTo().window(e);
			System.out.println("parent Title: "+driver.getTitle());
			}
			else
			{
				driver.switchTo().window(e);
				System.out.println("child url :"+driver.getTitle());
			}
		}	
		
	}

}
