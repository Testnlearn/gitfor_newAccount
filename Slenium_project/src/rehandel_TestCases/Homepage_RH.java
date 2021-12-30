package rehandel_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage_RH {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "/home/codilar/seleniumSetup/chromedriver");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.rehandel.com/");
			driver.manage().window().maximize();
			driver.findElement(By.className("user-logins")).click();  //classname
			Thread.sleep(3000);
			driver.findElement(By.id("mobile_number")).sendKeys("9604404393");
			driver.findElement(By.id("term-condit")).click();                   //id
			driver.findElement(By.linkText("Get Verification Code")).click();   //linktext
			//driver.findElement(By.xpath("//a[normalize-space()='Login using Password']")).click();
			
			
			//driver.findElement(By.cssSelector(".login-pass.text-camel")).click();
		
			//driver.findElement(By.className("login-passtext-camel")).click();
			
			//driver.findElement(By.linkText("Login using Password")).click();

			//driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[4]/div[1]/a[1]")).click();
			
			
			
			
			




	}

}
