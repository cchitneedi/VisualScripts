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

public class HBMagruderMemorial {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		eyes.setApiKey("76jdjWTXH106Aw9XSAsZg2A7X39YDYFUsg9x101Hyjq106lCk110");
		driver.manage().timeouts().pageLoadTimeout(140, TimeUnit.SECONDS);
		try {

			eyes.open(driver, "H B MAGRUDER MEMORIAL-4.0.99d", "[4.0.99d]-MAGRUDER");
			// -UAT- URL
			//driver.get("https://ns006371.ebscomedical.com");
			// -UAT- URL
			driver.get("https://uat-nvcvooy-t2cbe5jpm3uo2.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("-UAT- Site Home Page [4.0.99d]");

			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(3000);
			// 2nd
			eyes.checkWindow("-UAT- Site Home Page [4.0.99d]");

			driver.findElement(By.xpath("//strong[contains(text(),'CINAHL')]")).click();
			driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-custommyhealth-alberta-search-bar-container-query']"))
					.sendKeys("Medicine");
			Thread.sleep(2000);

			WebElement clickfunction;
			clickfunction = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-custommyhealth-alberta-search-bar-container-actions-submit']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site CINAHL result Page [4.0.99d]");

			driver.findElement(By.xpath("//strong[contains(text(),'PubMed')]")).click();
			WebElement clickfunction2;
			clickfunction = driver
					.findElement(By.xpath("//input[@id='edit-search-form-pubmed-search-bar-container-query']"));
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- Site PubMed result Page [4.0.99d]");

			driver.findElement(By.xpath("//strong[contains(text(),'Search All')]")).click();
			WebElement clickfunction3;
			clickfunction = driver
					.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-actions-submit']"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- Site Search All result Page [4.0.99d]");

			// 5th checkpoint
			eyes.checkWindow("-UAT- Last Page [4.0.99d]");
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).clear();

			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']"))
					.sendKeys("Yellow fever – Gabon");
			Thread.sleep(1000);
			WebElement clickfunction4;
			clickfunction = driver
					.findElement(By.cssSelector(".submit.expanded.button.js-form-submit.form-submit.focus-input"));
			JavascriptExecutor executor4 = (JavascriptExecutor) driver;
			executor2.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 6th checkpoint
			eyes.checkWindow("-UAT- Search Yellow Fever Result Page 4.0.99d");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(9000);
			driver.findElement(By.xpath("//a[contains(text(),'See 20 more')]")).click();
			Thread.sleep(6000);
			// 7th checkpoint
			eyes.checkWindow("-UAT- Pubmed Results page [4.0.99d]");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// 8th
			 eyes.checkWindow("-UAT- Grid View Results Page [4.0.99d]");

			driver.findElement(By.xpath("//a[contains(text(),'Equatorial Guinea.')]")).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			Thread.sleep(3000);
			// 6th checkpoint
			eyes.checkWindow("-UAT- Equatorial Results Page [4.0.99d]");
			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(3000);
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(4000);
			// 9th
			eyes.checkWindow("-UAT- Last Results Page [4.0.99d]");

		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
