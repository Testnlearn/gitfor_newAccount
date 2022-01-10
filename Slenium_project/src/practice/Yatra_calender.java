package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra_calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/codilar/seleniumSetup/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.cssSelector("input[id='BE_flight_origin_city']")).click();
		driver.findElement(By.cssSelector("input[name='flight_origin'] ")).sendKeys("bang");
		//Thread.sleep(3000);
		//List<WebElement> options= driver.findElements()
        
	}

}
