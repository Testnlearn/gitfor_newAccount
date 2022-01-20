package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/codilar/seleniumSetup/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Actions a =new Actions (driver);
		//a.moveToElement(driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"))).build().perform();    to hover on the element
		WebElement move= driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
	    a.moveToElement(driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
	    a.moveToElement(move).build().perform();
	
	}

}