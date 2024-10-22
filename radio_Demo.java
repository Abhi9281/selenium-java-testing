package Auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_download\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
		List <WebElement> gender = driver.findElements(By.id("sex"));
		int cnd=gender.size();
		System.out.println(cnd);
		
		for(int i=0;i<cnd;i++) {
			String txt= gender.get(i).getText();
			System.out.println(txt);
			gender.get(i).click();
			Thread.sleep(1000);
		}
		
		Thread.sleep(1000);
		driver.close();

	}

}
