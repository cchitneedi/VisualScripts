package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class PARKLANDHEALTH {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cchitneedi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Eyes eyes = new Eyes();
		eyes.setApiKey("79CYkxosb3KQJmYhkQhA4CLfGDeI9a62992l60V8LmyU110");
		driver.manage().timeouts().pageLoadTimeout(75, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "PARKLAND HEALTH AND HOSPITAL SYSTEM", "SITE ID - j2tj7rp6fujgy");
			//Master URL
			//driver.get("https://s6913921.ebscomedical.com");
			//UAT URL
			driver.get("https://uat-nvcvooy-j2tj7rp6fujgy.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("PARKLAND HEALTH AND HOSPITAL SYSTEM Home Page");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(5000);
			// 2nd checkpoint
			eyes.checkWindow("PARKLAND LAST PAGE");
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).sendKeys("Equatorial Guinea.");
			Thread.sleep(10000);
			WebElement clickfunction;
			clickfunction = driver.findElement(By.cssSelector("input.submit.expanded.button.js-form-submit.form-submit.focus-input"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(20000);
			JavascriptExecutor jsearchPubMed = (JavascriptExecutor) driver;
			jsearchPubMed.executeScript("window.scrollBy(0,2000)");
			// 3rd checkpoint
			eyes.checkWindow("Search PARKLAND Equatorial Article Result");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'See 667 more')]")).click();
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("check/open PARKLAND - PubMed Results page for Equatorial article");
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(4000);
			// 5th checkpoint
			eyes.checkWindow("check PARKLAND Equatorial article PubMed Results in Last page");
			driver.findElement(By.xpath("//a[contains(text(),'Subconjunctival loiasis.')]")).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			Thread.sleep(5000);
			eyes.setForceFullPageScreenshot(true);
			eyes.setHideScrollbars(true);
			// 6th checkpoint
			eyes.checkWindow("Switch Window handler page for PARKLAND - Subconjunctival article");
			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(5000);
			WebElement Subele;
			Subele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			Subele.click();
			Thread.sleep(4000);
			// 7th checkpoint
			eyes.checkWindow("check PARKLAND - PubMed Results Last page for Equatorial Topic");
		}
		finally {
			driver.quit();

			eyes.abortIfNotClosed();
		}
		
		
	}

}
