package Locators;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://demo.guru99.com/test/newtours/");
		
		//finding all available links on webpage
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
	
	/*public static void verifylink (String url) {
		try {
			URL link = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();


			if (httpURLConnection.getResponseCode() == 200) {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
			} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
		
		*/
		
		
		
	}

}

//TagName is used for urls, to store links in array
//TagName implements 2-3 java concepts
//href means link/url
