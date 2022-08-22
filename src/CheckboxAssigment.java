import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


	}

}
