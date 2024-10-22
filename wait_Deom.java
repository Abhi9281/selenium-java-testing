package Auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_Deom {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_download\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
//		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);//implicite way for wait time
		
		WebDriverWait w= new WebDriverWait(driver,5);
		
		WebElement Unm=driver.findElement(By.name("userName"));
		w.until(ExpectedConditions.attributeContains(Unm, "name", "username"));
		Unm.sendKeys("Abhishek");
		driver.findElement(By.name("password")).sendKeys("Pass");
		driver.findElement(By.name("submit")).click();

		
		
	}

}
