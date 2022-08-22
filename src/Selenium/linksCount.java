package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class linksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 * System.out.println(driver.findElements(By.tagName("a")).size()); //how to
		 * scope on particular area WebElement footerDriver =
		 * driver.findElement(By.id("gf-BIG"));
		 * System.out.println(footerDriver.findElements(By.tagName("a")).size());
		 * WebElement coloumnDriver =
		 * footerDriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		 * System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
		 */
		driver.get("https://www.amazon.com/");
		WebElement footerdriver = driver.findElement(By.id("navFooter"));
		System.out.println("No. of links in footer " + footerdriver.findElements(By.tagName("a")).size());
		WebElement coloumndriver = footerdriver
				.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]"));
		System.out.print("No. of links in coloumn " + coloumndriver.findElements(By.tagName("a")).size());
		for (int i = 0; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {
			String clicks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clicks);
		}
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> move = tabs.iterator();
		while (move.hasNext()) {
			driver.switchTo().window(move.next());
			System.out.println("Tab Title " + driver.getTitle());
		}

	}

}
