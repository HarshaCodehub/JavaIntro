import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		int h=0;
		driver.findElement(By.cssSelector(".dropdown-toggle.meganav-shop")).click();
		driver.findElement(By.xpath("(//a[text()='Fruits & Vegetables'])[2]")).click();
		String[] fruits = {"Watermelon","Banganapalli","Banana"};
		List favfruits = Arrays.asList(fruits);
		List<WebElement> items = driver.findElements(By.cssSelector("//div[@class='col-sm-12 col-xs-7 prod-name']/a"));
		for(int i=0;i<items.size();i++)
		{
			String[] splitItem = items.get(i).getText().split(" ");
			String preciseItem = splitItem[0].trim();
			if(favfruits.contains(preciseItem))
			{
				h++;
				driver.findElements(By.xpath("//div[@class='col-xs-12 bskt-opt ng-scope']/div/button")).get(i).click();
				if(h==fruits.length)
				{
					break;
				}
			}
		}
 		
				
	}

}
