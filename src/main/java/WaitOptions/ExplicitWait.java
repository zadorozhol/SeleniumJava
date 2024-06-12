package WaitOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://facebook.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 20); //explicit wait
		
		WebElement FirstName = wait.until(ExpectedConditions.visibilityOfElementLocated (By.name("email")));
		FirstName.sendKeys("Olesia");
driver.quit();

	}

}

/*
 * Explicit Wait:
 *  Waits explicitly for a certain condition to be met for a specific element.
 */
