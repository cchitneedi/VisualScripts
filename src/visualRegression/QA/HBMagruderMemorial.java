package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class HBMagruderMemorial {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Eyes eyes = new Eyes();
		eyes.setApiKey("wVE71yhGHadxX58P9ieyLRVJlpAXwCJAh100iJHBm6P3M110");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		try {
			
			eyes.open(driver, "H B MAGRUDER MEMORIAL", "MAGRUDER VR TEST");
			//Master URL
			//driver.get("https://ns006371.ebscomedical.com");
			//UAT URL
			driver.get("https://uat-nvcvooy-t2cbe5jpm3uo2.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("Home Page");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(3000);
			// 2nd checkpoint
			eyes.checkWindow("Last Page check");
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).sendKeys("Equatorial Guinea.");
			Thread.sleep(2000);
			WebElement clickfunction;
			clickfunction = driver.findElement(By.cssSelector(".submit.expanded.button.js-form-submit.form-submit.focus-input"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(15000);
			// 3rd checkpoint
			eyes.checkWindow("Search Equatorial Guinea Result check");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'See 667 more')]")).click();
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("check Pubmed Results page");
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(4000);
			// 5th checkpoint
			eyes.checkWindow("check Pubmed Results Last page");
			driver.findElement(By.xpath("//a[contains(text(),'Subconjunctival loiasis.')]")).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			Thread.sleep(3000);
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			// 6th checkpoint
			eyes.checkWindow("check window handler page for Subconjunctival article");
			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(3000);
			WebElement Subele;
			Subele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			Subele.click();
			Thread.sleep(3000);
			// 7th checkpoint
			eyes.checkWindow("check Pubmed Results Last page error");
		}
		finally {
			driver.quit();

			eyes.abortIfNotClosed();
		}
		
	}

}
