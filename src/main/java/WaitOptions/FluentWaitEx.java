package WaitOptions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://facebook.com");
		
		 FluentWait <WebDriver> wait = new FluentWait <WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(30)) // Maximum wait time
		            .pollingEvery(Duration.ofSeconds(5)) // Check every 5 seconds
		            .ignoring(NoSuchElementException.class); // Ignore NoSuchElementException

			WebElement FirstName = wait.until(ExpectedConditions.visibilityOfElementLocated (By.name("email")));
			FirstName.sendKeys("Olesia");
	driver.quit();
	}

}
/*
 * Fluent Wait: Similar to explicit wait 
 * but with additional flexibility in polling frequency 
 * and exception handling.
 */
*/