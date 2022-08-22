import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//parent to child - sibling - sibling traverse
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		driver.findElement(By.id("email")).sendKeys("harsha@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@data-testid='login-button']")).click();
		System.out.println(driver.findElement(By.xpath("//div/ul/li[4]/following-sibling::li[1]")).getText());
		//child-parent
		System.out.println(driver.findElement(By.xpath("//div/ul/li[4]/parent::ul/parent::div/ul/li[1]")).getText());
		
	}

}
