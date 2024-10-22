package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_download\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		Actions act=new Actions(driver);
		
		WebElement frameEle= driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
		driver.switchTo().frame(frameEle);
		
		WebElement ele1= driver.findElement(By.id("draggable"));
		WebElement ele2= driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(ele1, ele2).build().perform();
		if(ele2.getText().matches("Dropped!")) {
			System.out.println("Successful Drop...");
		}
		else {
			System.out.println("Invalid Drop...");
		}
	}

}
