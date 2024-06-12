package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		WebElement AlertButton = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		AlertButton.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement AlertButton2 = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
		AlertButton2.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		WebElement AlertButton3 = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		AlertButton3.click();
		driver.switchTo().alert().sendKeys("Hello Test");
		driver.switchTo().alert().accept();
		
		WebElement Result = driver.findElement(By.cssSelector("#result"));
		String actualResultText = Result.getText();
		String expectedResultText = "You entered: Hello Test";
		
		if(actualResultText.equals(expectedResultText)) {
			System.out.println("Test Pass");
			
		} else {
			System.out.println("Test Fail");
		}
		
Thread.sleep(3000);
driver.quit();
	}

}

/*
 * 
 * 
 * 
 * 
 * */
