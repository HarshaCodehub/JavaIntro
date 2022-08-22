import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("jacob");
		driver.findElement(By.name("pass")).sendKeys("mypass123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//form/div[3]")).sendKeys("john");
		//driver.findElement(By.cssSelector("index[name='pass']")).sendKeys("pass123");
		
		
		
		
	}

}
