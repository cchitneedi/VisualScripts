package AutomationScreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

public class Appittools {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cchitneedi\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Eyes eyes = new Eyes();
		eyes.setApiKey("wVE71yhGHadxX58P9ieyLRVJlpAXwCJAh100iJHBm6P3M110");
		
		try {
		
			//eyes.open(driver, "EBSCO - Compare PathwaysDev site & Production site section wise", "Home Page, Bussiness and Economics, Education & Sustainability check");
			driver.get("https://pathwaysdev.stacksplatform.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-name")).sendKeys("NES_Patron");
			driver.findElement(By.cssSelector("#edit-pass")).sendKeys("exm9fek5tfu-WMB@hwz");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#edit-submit")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("darkModeToggle")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("darkModeToggle")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("darkModeToggle")).click();
		}
		finally {
			driver.quit();
			
			//eyes.abortIfNotClosed();
		}
		
		
	}

}
