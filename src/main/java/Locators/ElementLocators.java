package Locators;
import org.openqa.selenium.By;

public class ElementLocators {

	public static void main(String[] args) throws InterruptedException {

		//Launch Firefox Browser - Driver -
		System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\Olesi\\MavenTest\\geckodriver.exe");

		//System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");

		//System.setProperty("webdriver.chromedriver.driver", "C://Users//lenovo//Downloads//chromedriver-win64(1)//chromedriver-win64//chromedriver.exe");


		WebDriver driver=new FirefoxDriver();
		//WebDriver driver1=new ChromeDriver();

		//Open Linkedin.com
		driver.get("https://linkedin.com");
				
		//8 element locators
		//id,name,classname,,linktext,partiallinktext,tagname,xpath and css

		//Enter User - id=session_key 

		//driver.findElement(By.id("session_key")).sendKeys("newtest");

		//id

		//WebElement e=driver.findElement(By.id("email"));
		//e.sendKeys("newtest");

		//WebElement signin=driver.findElement(By.linkText("Sign in"));
		//signin.click();

		Thread.sleep(3000);
		 WebElement we=driver.findElement(By.id("username"));
		 we.sendKeys("test@gmail.com");
		 
		 //name
		 WebElement pwd=driver.findElement(By.name("session_password"));
		 pwd.sendKeys("Test123");
		 //Linktext
		//WebElement forgotpwd=driver.findElement(By.linkText("Forgot password?"));
		//forgotpwd.click();

		//Partial Linktext
		WebElement pwdforogt=driver.findElement(By.partialLinkText("password?"));
		pwdforogt.click();

		//WebElement fgpwd=driver.findElement(By.className("font-sans text-md font-bold link leading-regular sign-in-form__forgot-password--full-width"));
		//fgpwd.click();





		//WebElement user=driver.findElement(By.className("text-color-text font-sans text-md outline-0 bg-color-transparent grow"));
		//user.sendKeys("raghutest@gmail.com");

		//driver.findElement(By.id("session_key")).sendKeys("test@gmail.com");

		//WebElement u1=driver.findElement(By.id("session_key"));
		//u1.sendKeys("newtest@gmail.com");
		/*

				//Enter Password
		WebElement password=driver.findElement(By.name("session_password"));
		password.sendKeys("NewTest123");

				//Click on Join Now		
		//WebElement joinnow=driver.findElement(By.className("nav__button-tertiary btn-md btn-tertiary"));
		//joinnow.click();

		WebElement forgotpassword=driver.findElement(By.linkText("Forgot password?"));
		forgotpassword.click();

		WebElement useragreement=driver.findElement(By.partialLinkText("User"));
		useragreement.click();
		//System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");

		WebElement privacy=driver.findElement(By.className("t-sans t-black--light t-semibold header-nav__toplink"));
		privacy.click();*/
			}

		}

