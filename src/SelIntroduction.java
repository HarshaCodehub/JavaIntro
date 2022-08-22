import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		
		//Invoking Browser
		//Chrome -Chrome Driver ->Methods
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//webdriver.chrome.driver->path
		//Firefox launch
		//webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//Microsoft Edge Launch
		//webdriver.edge.driver
		//C:\Users\dell\Downloads\edgedriver_win64
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://testbook.com/home");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
