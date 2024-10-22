package Auto;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software_download\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}

}
