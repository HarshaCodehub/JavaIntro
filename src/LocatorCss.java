import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//for time delays in Web sites
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.netflix.com/in/login?nextpage=https%3A%2F%2Fwww.netflix.com%2Fbrowse");
		driver.findElement(By.cssSelector("input#id_userLoginId")).sendKeys("Harsha");
		driver.findElement(By.cssSelector("input#id_password")).sendKeys("123456");
		driver.findElement(By.cssSelector("button.login-button")).click();
		System.out.println(driver.findElement(By.cssSelector("div.ui-message-contents")).getText());
		
	}

}
