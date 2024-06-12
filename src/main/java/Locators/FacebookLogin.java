package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	static String email = "test@olesia.com";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "C://Users//Olesi//MavenTest//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
       WebElement CreateAccount = driver.findElement(By.linkText("Create new account"));
       CreateAccount.click();
       Thread.sleep(3000);
		WebElement FirstName = driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Olesia");
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("TestQA");
		WebElement Email = driver.findElement(By.name("reg_email__"));
		Email.sendKeys(email);
		WebElement Password = driver.findElement(By.name("reg_passwd__"));
		Password.sendKeys("TestQApassword");
		
		
		
		WebElement ReEnterEmail = driver.findElement(By.name("reg_email_confirmation__"));
		ReEnterEmail.sendKeys(email);
		
		
		WebElement DayofBirth = driver.findElement(By.id("day"));
		
		Select Day= new Select(DayofBirth);
		Day.selectByIndex(10);
		
        WebElement MonthofBirth = driver.findElement(By.id("month"));
		
		Select Month = new Select(MonthofBirth);
		Month.selectByVisibleText("Mar");
		

		WebElement YearofBirth = driver.findElement(By.id("year"));
		
		Select Year= new Select(YearofBirth);
		Year.selectByVisibleText("1990");
	       Thread.sleep(5000);
		
		WebElement Custom = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[3]/input[1]"));
		Custom.click();
	       Thread.sleep(3000);
		 WebElement Pronoun = driver.findElement(By.name("preferred_pronoun"));
			
			Select Pronouns = new Select(Pronoun);
			Pronouns.selectByVisibleText("She: \"Wish her a happy birthday!\"");
			
			WebElement SignUp = driver.findElement(By.name("websubmit"));
			SignUp.click();
			
			
		
		
		/*WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("log in");
        WebElement Password = driver.findElement(By.name("pass"));
        Password.sendKeys("password");
	}
	*/

}
}