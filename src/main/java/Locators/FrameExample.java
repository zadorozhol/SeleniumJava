package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameExample {
	static WebDriver d;
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
        d = new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/nested_frames");
		//d.switchTo().frame(0);
		d.switchTo().frame(0);
		WebElement FrameLeft = d.findElement(By.name("frame-right"));
		FrameLeft.click();
		if(FrameLeft.isDisplayed()){
			System.out.println("Element is found");
		}else {
			System.out.println("Element is NOT Found");
		}
		
		//d.switchTo().frame("packageListFrame");
		//d.switchTo().frame(0);	
		d.quit();
	}
	
    // TO REMEMBER IN CASE OF FRAMES WE USE SWITCH TO - driver.switchTo().frame(0);
	//IN CASE OF ALERTS WE USE SWITCH TO DOT ALERT- driver.switchTo().alert().sendKeys
	//IN CASE OF DROP DOWN WE USE SELECT CLASS - Select s1 = new Select(dropdown);  
	//IN CASE OF CHECK BOX NO ADDITIONAL, JUST REGULAR CLICK METHOD
}

