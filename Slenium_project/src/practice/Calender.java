package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/codilar/seleniumSetup/chromedriver");
           WebDriver driver =new ChromeDriver ();
           driver.get("https://www.path2usa.com/travel-companions");
           //take date "6"
           driver.findElement(By.cssSelector("input[value='Date of Travel']")).click();
           
           //get the list of all dates by using common attribute value
           
           List<WebElement> dates= driver.findElements(By.className("day"));
           //get the total no. of elements using count variable and .size() method
           int count =driver.findElements(By.className("day")).size();
           
           for(int i=0;i<count;i++)    //here iterate all the list and check if your input is coming
           {
        	   String text =driver.findElements(By.className("day")).get(i).getText();
        	   
        	   if(text.equalsIgnoreCase("6"))
        	   {
        	   driver.findElements(By.className("day")).get(i).click();
        	   break;
        	   }
	}

}
}