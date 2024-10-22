package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\software_download\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Actions act=new Actions(driver);
		
		WebElement Unm= driver.findElement(By.id("email"));
		Unm.sendKeys("abhi");
		
		act.click(Unm).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL)
		.click(driver.findElement(By.id("pass"))).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
		.click(driver.findElement(By.name("login")))
		.build().perform();
		
		

	}

}
