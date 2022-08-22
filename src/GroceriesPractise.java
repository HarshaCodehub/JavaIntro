import java.util.Arrays;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GroceriesPractise {

	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(8));//explicit wait
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);//implicit wait
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] veggies = {"Cucumber","Tomato","Apple"};
		addItems(driver, veggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
			
	}
	public static void addItems(WebDriver driver,String[] veggies)
	{
		int h = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			String[] veggie = products.get(i).getText().split("-");
			String actualVeggie = veggie[0].trim();
			List selecteditems = Arrays.asList(veggies);
			if(selecteditems.contains(actualVeggie))
			{
				h++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(h==veggies.length)
				{
					break;
				}
			}

		}
	}
}
