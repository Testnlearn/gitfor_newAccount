package exersize_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Editbox_Errormsg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/codilar/seleniumSetup/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
WebElement adult = driver.findElement(By.xpath("(//select[@class=\"bc-neutral-100 bg-transparent\"])[1]"));
        Select dropdown =new Select(adult);
        dropdown.selectByValue("2");
        WebElement Children = driver.findElement(By.xpath("(//select[@class=\"bc-neutral-100 bg-transparent\"])[2]")); //(//select[@class='bc-neutral-100 bg-transparent'])[2]
        Select dropdown2 =new Select(Children);
        dropdown2.selectByValue("1");
        driver.findElement(By.cssSelector("a[href=\'javascript:void(0);\']")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Airline name\"]")).sendKeys("indigo");
    driver.findElement(By.cssSelector("button[class=\"px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border\"]")).click();

    System.out.println(driver.findElement(By.xpath("//span[@class='to-ellipsis o-hidden ws-nowrap fs-3 c-white']")).getText());
	}

}
