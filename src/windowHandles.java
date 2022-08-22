import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.partialLinkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		Set<String> windows = driver.getWindowHandles();//parent id, child id has been stored in windows
		Iterator<String> parts =windows.iterator();
		String parent = parts.next();
		String child = parts.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("(//h2/span)[1]")).getText());
		String needed = driver.findElement(By.xpath("(//h2/span)[1]")).getText().split("to")[1].trim().split(" ")[0];
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(needed);
		}

}
