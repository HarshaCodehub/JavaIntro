import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class NewLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		driver.findElement(By.id("email")).sendKeys("harsha@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@data-testid='login-button']")).click();
		System.out.println(driver.findElement(By.className("m-l-3-xs")).getText());
		Assert.assertEquals(driver.findElement(By.className("m-l-3-xs")).getText(), "Please confirm your email to fully activate your account. You can do this by clicking the link in the email confirmation we sent you.");
		System.out.println(driver.findElement(By.xpath("//a/span")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//a/span")).getText(), "Harsha");
		driver.findElement(By.xpath("//span[text()='harsha']")).click();
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		

	}

}
