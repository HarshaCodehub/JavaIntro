package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollJavascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)");
		js.executeScript("document.querySelector('div.tableFixHead').scrollTop=4000");
		List<WebElement>numbers =driver.findElements(By.cssSelector("table#product td:nth-child(4)"));
		int sum = 0;
		for(int i=0;i<numbers.size();i++)
		{
			sum = sum + Integer.parseInt(numbers.get(i).getText());
			
		}
		System.out.println(sum);
		driver.findElement(By.cssSelector("div.totalAmount"));
		int Total= Integer.parseInt(driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, Total);
		
	}

}
