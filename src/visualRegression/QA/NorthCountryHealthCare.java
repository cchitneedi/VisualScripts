package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NorthCountryHealthCare {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Eyes eyes = new Eyes();
		eyes.setApiKey("U7sd0gV48usZ4bzkwcPsAs104X10619109icnq7fzBdCqvABU110");
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "NORTH COUNTRY-4.0.96e", "4.0.96e-NORTHCOUNTRY");
			// UAT URL
			//driver.get("https://ns260564.ebscomedical.com/");
			// UAT URL
			driver.get("https://uat-nvcvooy-ouofirtnmihi2.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("UAT Home Page 4.0.96e");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(3000);
			// 2nd checkpoint
			eyes.checkWindow("UAT Last Page 4.0.96e");
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']"))
					.sendKeys("Equatorial Guinea.");
			Thread.sleep(5000);
			JavascriptExecutor jsearchPubMed = (JavascriptExecutor) driver;
			jsearchPubMed.executeScript("window.scrollBy(0,1000)");
			WebElement clickfunction;
			clickfunction = driver
					.findElement(By.cssSelector(".submit.expanded.button.js-form-submit.form-submit.focus-input"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(15000);
			// 3rd checkpoint
			eyes.checkWindow("UAT Equatorial Results Page 4.0.96e");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'See 713 more')]")).click();
			Thread.sleep(9000);
			// 4th checkpoint
			eyes.checkWindow("UAT PUBMED Equatorial 4.0.96e");

			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(5000);
			// 5th
			eyes.checkWindow("UAT Grid View Results Page 4.0.96e");

			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(4000);
			// 6th checkpoint
			eyes.checkWindow("UAT Last Results Page 4.0.96e");

		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
