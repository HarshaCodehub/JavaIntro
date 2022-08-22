

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Groceries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		int h = 0;
		List<WebElement> product =  driver.findElements(By.cssSelector("h4.product-name"));
		/*for(int i=0;i<product.size();i++)
		{
			String productname = product.get(i).getText();
			if(productname.contains("cucumber"))
					{
						driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
						break;
					}
		}*/
		String[] veggiesNeeded = {"Cucumber","Brocolli","Beetroot"};//if wanted to add more items use arrays
		for(int i=0;i<product.size();i++)
		{
			String[] productname = product.get(i).getText().split("-");
			//productname.split("-");
			String actualveggie = productname[0].trim();
			List veggiesNeededList = Arrays.asList(veggiesNeeded);
			if(veggiesNeededList.contains(actualveggie))
			{
				h++;
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();//this will fail due to dependency on text
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(h==veggiesNeeded.length)
					{
					break;
					}
			}
		}
	}

}
