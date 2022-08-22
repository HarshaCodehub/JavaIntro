package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	//	String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		//java methods to get status code

		SoftAssert a = new SoftAssert();
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection connect = (HttpURLConnection)new URL(url).openConnection();
			connect.setRequestMethod("HEAD");
			connect.connect();
			int respcode =connect.getResponseCode();
			System.out.println(respcode);
			a.assertTrue(respcode<400, "The link with text"+link.getText()+" is broken with code "+respcode);
			/*if(respcode>400)
			{
				System.out.println("The link with text"+link.getText()+" is broken with code "+respcode);
				Assert.assertTrue(false);
			}*/
		}
		a.assertAll();
		
		
	}

}
