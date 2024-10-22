package Auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\software_download\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
		WebElement day= driver.findElement(By.id("day"));
		
		Thread.sleep(1000);
		Select d1=new Select(day);
		//d1.selectByValue("2");
		//d1.selectByIndex(3);
		//d1.selectByVisibleText("3");
		
		//=========================================================
		//to print the values present in day
		
		List<WebElement> dd=d1.getOptions();
		System.out.println(dd.size());
		
		for(int i=0;i<dd.size();i++) {
			
			String txt= dd.get(i).getText();
			System.out.println(txt);
		}
		
		
	}

}
