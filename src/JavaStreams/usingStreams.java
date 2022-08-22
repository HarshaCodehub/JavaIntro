package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class usingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
		String[] veggies = {"Cucumber","Tomato","Apple"};
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
		driver.findElement(By.xpath("(//a/img)[3]")).click();
		driver.findElement(By.cssSelector("div.action-block button")).click();	
		List<WebElement> items= driver.findElements(By.xpath("//td/p[@class='product-name']"));
		List<String>fv= items.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sorted= fv.stream().sorted().collect(Collectors.toList());
		//System.out.println(sorted);
		Assert.assertTrue(fv.equals(sorted));
		//finding one particular item's prices
		List<String>price =items.stream().filter(p->p.getText().contains("Tomato")).
				map(p->getItemPrice(p)).collect(Collectors.toList());
		price.forEach(m->System.out.println(m));
		
		
		
		}

	private static String getItemPrice(WebElement p) {
		// TODO Auto-generated method stub
		String priceValue=p.findElement(By.xpath("//tr/td[1]//following-sibling::td[2]")).getText();
		return priceValue;
	}
}



