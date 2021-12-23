package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLocaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/codilar/seleniumSetup/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rehandel.com/");
		driver.findElement(By.className("user-logins")).click();            //classname
		driver.findElement(By.id("mobile_number")).sendKeys("9604404393");
		driver.findElement(By.id("term-condit")).click();                   //id
		driver.findElement(By.linkText("Get Verification Code")).click();   //linktext
		
		
		
		//driver.findElement(By.cssSelector("//a[@style='user-select: auto;']")).click();
	
		//driver.findElement(By.className("login-pass")).click();
		
		//driver.findElement(By.linkText("Login Using Password")).click();

		//driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[4]/div[1]/a[1]")).click();
		
		
		
		
		//System.out.println("this is first");

	}

}
