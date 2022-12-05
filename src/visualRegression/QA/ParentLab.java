package visualRegression.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class ParentLab {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		eyes.setApiKey("wVE71yhGHadxX58P9ieyLRVJlpAXwCJAh100iJHBm6P3M110");
		try {
			eyes.open(driver, "Parent Lab", "[4.0.84]-SITE ID i7bz3ant757xy");
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			//driver.get("https://parentlabhldemo.stacksplatform.com/");
			driver.get("https://uat-nvcvooy-i7bz3ant757xy.us-4.platformsh.site/");
			Thread.sleep(2000);
			eyes.checkWindow("UAT SITE HOME PAGE 4.0.84");
			WebElement linktxt = driver.findElement(By.xpath("//a[contains(text(),'Travel and Health')]"));
			linktxt.click();
			eyes.checkWindow("UAT SITE Travel and Health 4.0.84");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@linkkey='11857']")).click();
			eyes.checkWindow("UAT SITE Travel PAGE 4.0.84");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-query']"))
					.sendKeys("Medicine");
			driver.findElement(By.xpath("//input[@id='edit-search-form-eit-search-bar-container-actions-submit']"))
					.click();
			Thread.sleep(2000);
			eyes.checkWindow("UAT SITE Medicine Search result 4.0.84");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			eyes.checkWindow("UAT SITE Medicine Search result Grid View 4.0.84");
			driver.findElement(By.xpath(
					"//body/div[1]/div[2]/div[5]/div[1]/div[3]/div[1]/div[1]/footer[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]"))
					.click();
			Thread.sleep(1000);
			eyes.checkWindow("UAT SITE Health & Myth Page 4.0.84");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}
	}

}
