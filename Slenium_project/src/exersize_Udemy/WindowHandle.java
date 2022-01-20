package exersize_Udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/codilar/seleniumSetup/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator(); //[parentID, childID, subChildID]
			
		String parentWindow = it.next();

		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.xpath("//body")).getText());

		driver.switchTo().window(parentWindow);

		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
	
	}

}
