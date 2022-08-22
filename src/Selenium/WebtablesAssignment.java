package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)");
		System.out.println("No. of rows " + driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		System.out.println(
				"No. of coloumns " + driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size());
		List<WebElement> secondrow = driver.findElements(By.xpath("(//tr[3])[1]/td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());

		// table[@name='courses']/tbody/tr/th
		// (//table[@name='courses']/tbody/tr)[3]
	}

}
