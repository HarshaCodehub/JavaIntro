import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");	
		driver.findElement(By.xpath("//form/div/input[@name='name']")).sendKeys("Harsha");
		driver.findElement(By.xpath("//form/div/input[@name='email']")).sendKeys("Harsha@gmail.com");
		driver.findElement(By.xpath("//form/div/input[@type='password']")).sendKeys("password");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropbox = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(dropbox);
		gender.selectByVisibleText("Male");
		driver.findElement(By.cssSelector("[value='option1']")).click();
		driver.findElement(By.name("bday")).sendKeys("24/12/1995");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		}

}
