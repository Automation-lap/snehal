package demo.webdrivermanerexamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class GetScreeshot2 {

	public static void main(String[] args) throws IOException {
		SeleniumUtility m1 = new SeleniumUtility();
		WebDriver driver = m1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		// type cast WebDriver instance into TakesScreenshot interface
//		String fileLocation = ".\\screenshots\\vtiger_LoginPage.jpg";
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		File file = ts.getScreenshotAs(OutputType.FILE);
//
//		FileUtils.copyFile(file, new File(fileLocation));

		 String fileLocation = ".\\screenshots\\vtiger_" + System.currentTimeMillis()+ ".jpg";
		 getScreenshot(driver, fileLocation);

	}

	public static void getScreenshot(WebDriver driver, String filePath) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File file = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
//String fileLocation=".\\screenshots\\vtiger_"+System.currentTimeMillis()+".jpg";