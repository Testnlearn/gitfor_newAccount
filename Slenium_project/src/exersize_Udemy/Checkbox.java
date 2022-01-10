
package exersize_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/codilar/seleniumSetup/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption1")).click();   //checkbox selected 
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //verified if seleceted
		driver.findElement(By.id("checkBoxOption1")).click();                            //deselected checkbox
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());  //verified if desleceted  

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); //getting count of checkboxes here

	}
}