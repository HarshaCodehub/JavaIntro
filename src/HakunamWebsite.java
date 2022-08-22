import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HakunamWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hakunam.in/");
		driver.findElement(By.linkText("My account")).click();
		// driver.findElement(By.name("xoo-ml-reg-phone")).sendKeys("7337414047");
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("7337414047");
		driver.findElement(By.cssSelector("input#reg_email")).sendKeys("navyalakshman18@gmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("thotakurakatta");
		driver.findElement(By.id("automatewoo_optin")).click();
		driver.findElement(By.xpath("//button[@value='Register']")).click();
		driver.close();
		// body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]

	}

}
