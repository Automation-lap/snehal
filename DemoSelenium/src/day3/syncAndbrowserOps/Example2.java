package day3.syncAndbrowserOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Example2 {
	static WebDriver driver;
public static void main(String[] args) {
	//step1
	setUp("firefox");
	//step2
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//identify and enter username, will get 0-30 sec to identify the element
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	//identify and enter password, will get 0-30 sec to identify the element
	driver.findElement(By.name("password")).sendKeys("Admin123");
	
	//identify and click on it,will get 0-30 sec to identify the element
	driver.findElement(By.className("orangehrm-login-button")).click();
	
	//identify and click on user profile,will get 0-30 sec to identify the element
	driver.findElement(By.className("oxd-userdropdown-icon")).click();
	
	//identify and click on logout,will get 0-30 sec to identify the element
	driver.findElement(By.linkText("Logout")).click();
	
}
public static void setUp(String browserName) {
	if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
	} else if (browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		driver = new FirefoxDriver();
	} else if (browserName.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
		

	}

}
