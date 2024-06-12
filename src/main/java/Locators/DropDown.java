package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://the-internet.herokuapp.com/dropdown");
 WebElement dropdown = driver.findElement(By.id("dropdown"));
 Select s1 = new Select(dropdown);
 
 List <WebElement> dropdown1=s1.getOptions();
 for(WebElement st:dropdown1) {
	 System.out.println(st.getText());
 }
 s1.selectByVisibleText("Option 2");
	Thread.sleep(5000);
 driver.quit();
	}
	

}
/*

System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
WebDriver d=new FirefoxDriver();
d.get("http://the-internet.herokuapp.com/dropdown");
WebElement we=d.findElement(By.id("dropdown"));

Select sl=new Select(we);

List<WebElement> we1=sl.getOptions();
for(WebElement st: we1) {
	System.out.println(st.getText());
}

sl.selectByVisibleText("Option 2");

*/