package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {
	
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "/home/codilar/seleniumSetup/chromedriver");
	
    WebDriver driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();  // to delete the browser cookies
      
      driver.get("http://rehandel.com/");
      
      
      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //getting screenshot
       
		Files.copy(src,new File("/home/codilar/Screenshotfromselenium/screenshot2.png")); //here we have paste it on folder

}
}
//driver.manage().deleteCookieNamed("sessionkey");// click on any link n verify login page
