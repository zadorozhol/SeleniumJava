package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseEventsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ca/");
Actions act = new Actions(driver);
WebElement we = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
act.moveToElement(we).build().perform();

driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();

	}

}
