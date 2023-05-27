package day2.basicobjectidentification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginInApplication {
	

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome");
		//enter application url
		driver.get("https://www.saucedemo.com/");
	    //print page title
		System.out.println("Login page title: "+driver.getTitle());
		//enter user name
		/*Step1: identify username input field */
		WebElement userNameInputField=driver.findElement(By.id("user-name"));
		/*Step2 : perform required operation */
		userNameInputField.sendKeys("standard_user");
		
		
		//enter user name
				/*Step1: identify password input field */
				WebElement passwordInputField=driver.findElement(By.name("user-name"));
				/*Step2 : perform required operation */
				userNameInputField.sendKeys("secret_sauce");
				
		/** click on login button */
			/* Step1: identify login button  */
				WebElement loginBtn=driver.findElement(By.id("login-button"));
				/* Step2: perform required operation */
				loginBtn.click();
		
	}

	public static WebDriver setUp(String browsername) {	
	
		if(browsername.equalsIgnoreCase("chrome")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			/*2. After setting the path of driver executable, create an instance of required browser*/
			return new InternetExplorerDriver();
		}
		return null;
	}
}


/*
 * open chrome browser
 * enter application url
 * print login page title
 * enter username
 * enter password
 * click on login button
 * print page title
 * close the title
 */
