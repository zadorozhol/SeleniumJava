package WaitOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://facebook.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement FirstName = driver.findElement (By.name("email"));
		FirstName.sendKeys("Olesia");
driver.quit();

	}

}

//Thread.sleep: Pauses the execution for a fixed amount of time;
//not recommended for synchronization in Selenium tests.
