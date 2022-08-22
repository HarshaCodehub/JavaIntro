package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys("Ind");

		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']"))
				.getAttribute("value"));

	}

}
