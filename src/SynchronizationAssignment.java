import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait pause = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("learning");// can also use this
																									// locator=
																									// div.form-group:nth-child(3)
		driver.findElement(By.cssSelector("label.customradio:nth-child(2)")).click();
		pause.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		WebElement category = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select dropBox = new Select(category);
		dropBox.selectByVisibleText("Student");
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		pause.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));
		List<WebElement> gadgets = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for (int i = 0; i < gadgets.size(); i++) {
			gadgets.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();

	}

}
