package rehandel_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RH_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/codilar/seleniumSetup/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rehandel.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//header/div[1]/div[3]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		
		
	}

}
