package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calenderAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("li.sc-fbyfCU.BXfBL:nth-child(2) span.sc-GEbAx.kenSRj")).click();
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("//div/input")).sendKeys("Hyde");
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector("li[role='presentation']"))));
		List<WebElement> Locations= driver.findElements(By.cssSelector("li[role='presentation']"));
		for(WebElement location : Locations)
		{
			if(location.getText().contains("Rajiv"))
			{
				location.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New");
		List<WebElement> Destinations = driver.findElements(By.cssSelector("li[role='presentation']"));
		for(WebElement destination : Destinations)
		{
			if(destination.getText().contains("Indira"))
			{
				destination.click();
				break;
			}
		}
		String month = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		while(!month.contains("July"))
		{
			driver.findElement(By.xpath("(//span[@role=\"button\"])[2]")).click();
			break;
		}
		List<WebElement> dates = driver.findElements(By.cssSelector("div.DayPicker-Day"));
		for(WebElement date : dates)
		{
			if(date.getText().contains("5"))
				
			{
				date.click();
				break;
			}
		}
		
		

	}

}
