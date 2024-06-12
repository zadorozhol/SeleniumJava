package WaitOptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit wait
		driver.get("https://facebook.com");
		WebElement FirstName = driver.findElement(By.name("email"));
		FirstName.sendKeys("Olesia");
driver.quit();
}

}

/*Implicit Wait: 
 * Waits implicitly for a certain amount of time for all elements before 
 * throwing an exception.
 */
