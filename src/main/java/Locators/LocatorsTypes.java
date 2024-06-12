package Locators;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsTypes {

	public static void main(String[] args) {
		//Launch Firefox Browser - Driver - Chrome Broweser 
		
		//System.setProperty("webdriver.geckodriver.driver", "C://Users//Olesi//MavenTest//geckodriver.exe");
		//or WebDriverManager.chromedriver().setup();
		//or WebDriverManager.firefoxdriverr().setup();
		System.setProperty("webdriver.chromedriver.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
//WebDriver driver = new FirefoxDriver();
WebDriver driver1 = new ChromeDriver();
driver1.get("https://www.facebook.com");

//id

WebElement username = driver1.findElement(By.id("email"));
username.sendKeys("olesiazadorozhnia@hotmail.com");

// name

WebElement password = driver1.findElement(By.name("pass"));
password.sendKeys("123456788");


WebElement LogIn = driver1.findElement(By.name("login"));
LogIn.click();

//LinkTest

//WebElement ForgotPassword = driver1.findElement(By.linkText("Forgot password?"));
//ForgotPassword.click();


//PartialLinkText

WebElement ForgotPassword = driver1.findElement(By.partialLinkText("Forgot"));
ForgotPassword.click();


List<WebElement> links = driver1.findElements(By.tagName("a"));

//iterating each link and checking the response status
for(WebElement link: links) {
	String url = link.getAttribute("href");
	verifylink1(url);
}


	}
	
	public static void verifylink1(String url) {
		try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000);
		httpURLConnection.connect();
		
		if(httpURLConnection.getResponseCode() == 200) {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		}else {
			System.out.println(url + "-" + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
	} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
	}

}}

/*
 * ID (most stable because unique)
 * Name
 * ClassName
 * Linktext (is the text between two tags on the element. < is a tag name
 * PartialLinkText
 * 
 * CssSelector
 * xpath
 * TagName
 *
 * 
 * 
 * Browser specific driver has to be downloaded
 * 
 * FireFox
 * Chrome
 * 
 * 
 * Driver
 
*/