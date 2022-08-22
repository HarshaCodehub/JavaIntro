import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsAjax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486391490878&hvpos=&hvnetw=g&hvrand=17200844530535684559&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062156&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=EAIaIQobChMIzuLl5YXU9wIVEBsrCh1zng5HEAAYASAAEgJ2cfD_BwE");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		WebElement search = driver.findElement(By.id("nav-search-bar-form"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//a.moveToElement(driver.findElement(By.id("nav-search-bar-form"))).click().sendKeys("HELLO").build().perform();
		a.moveToElement(search).contextClick().build().perform();

	}

}
