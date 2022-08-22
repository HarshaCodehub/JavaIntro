import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		driver.findElement(By.id("email")).sendKeys("harsha@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		//driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password");
		//driver.findElement(By.className("m-l-0-xs")).click();
		driver.findElement(By.xpath("//input[@data-testid='login-button']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("div.m-b-3-xs")).getText());
		String password = getPassword(driver);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@data-testid='login-button']")).click();
		//System.out.println(driver.findElement(By.cssSelector("div.auth-flash-error")).getText());
		//driver.get("https://sso.teachable.com/secure/9521/identity/forgot_password");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("harsha@gmail.com");
		//driver.findElement(By.xpath("//div/input")).sendKeys("harsha@gmail.com");
		//driver.findElement(By.cssSelector("form div[2]")).click();
		//driver.findElement(By.xpath("//input[@type='email']")).clear();
		//driver.findElement(By.cssSelector("input[type='email']")).sendKeys("harsha@gmail.com");
		//for similar attributes and values
		//Xpath("//input[type='email'][2]")
		//driver.findElement(By.xpath("//input[@name='commit']")).click();
		//for css console - input[name='commit']:nth-child(3);
		
		
	}

	public static String getPassword(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		driver.findElement(By.id("email")).sendKeys("harsha@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		String passwordText = driver.findElement(By.cssSelector("div.m-b-3-xs")).getText();
		String[] passwordArray = passwordText.split(" ");
		String password = passwordArray[3];
		return password;
		
	}
}
