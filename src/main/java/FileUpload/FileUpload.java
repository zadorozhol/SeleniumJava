package FileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement fileUpload = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		fileUpload.sendKeys("C://Users//Olesi//Desktop//Selenium Java//Day 13//TestData.xlsx");
		WebElement terms = driver.findElement(By.xpath("//input[@id='terms']"));
		terms.click();
		
		WebElement SubmitFile = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		SubmitFile.click();
		
		//WebElement ConfirmUpload = driver.findElement(By.xpath("//center[normalize-space()='1 file has been successfully uploaded.']"));
		
		 WebDriverWait wait = new WebDriverWait(driver, 20);
	        WebElement confirmUpload = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//center[normalize-space()='1 file has been successfully uploaded.']")));
		
		
		
		String ActualResult = confirmUpload.getText().trim().replaceAll("\\s+", " ");
		String ExpectedResult = "1 file has been successfully uploaded.";
		
		System.out.println(ActualResult);
		
		if (ActualResult.equals(ExpectedResult))
		{
			System.out.println("Test Pass");
		} 
		else {
			System.out.println("Test Fail");
		
		}
//driver.quit();
}

		
	}
