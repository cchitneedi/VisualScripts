package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PARKLANDHEALTH {

	public static void main(String[] args) throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		Eyes eyes = new Eyes();
		//chrantrent@gmail.com
		eyes.setApiKey("LZLxPWPBvOSNYFXKIUS8o7cKrgRhQwjWZnMvd104jAtyI110");
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "PARKLAND HEALTH 4.0.1.109b", "4.0.1.109b-PARKLAND");
			// -UAT- URL
			//driver.get("https://s6913921.ebscomedical.com");
			// -UAT- URL
			driver.get("https://uat-nvcvooy-j2tj7rp6fujgy.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("-UAT- SITE home page [4.0.1.109b]");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(5000);
			// 2nd checkpoint
			eyes.checkWindow("-UAT- SITE LAST HOME page [4.0.1.109b]");

			// EBSCO Results
			driver.findElement(By.xpath("//strong[contains(text(),'EBSCO')]")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-eds-search-bar-container-query']"))
					.sendKeys("Medicine");
			Thread.sleep(2000);

			WebElement clickfunction;
			clickfunction = driver
					.findElement(By.xpath("//input[@id='edit-search-form-eds-search-bar-container-actions-submit']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("--UAT-- Site EBSCO result Page [4.0.1.109b]");

			// CINAHL COMPLETE Results
			driver.findElement(By.xpath("//strong[contains(text(),'CINAHL Complete')]")).click();
			WebElement clickfunction3;
			clickfunction3 = driver
					.findElement(By.xpath("//input[@id='edit-search-form-eds-search-bar-container-actions-submit']"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", clickfunction3);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site CINAHL COMPLETE result Page [4.0.1.109b]");

			
			// Medline Complete Results
			driver.findElement(By.xpath("//strong[contains(text(),'MEDLINE Complete')]")).click();
			WebElement clickfunction6;
			clickfunction6 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customgoogle-scholar-search-bar-container-actions-submit']"));
			JavascriptExecutor executor6 = (JavascriptExecutor) driver;
			executor6.executeScript("arguments[0].click();", clickfunction6);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site MEDLINE COMPLETE result Page [4.0.1.109b]");

			// Health Business Elite
			driver.findElement(By.xpath("//strong[contains(text(),'Health Business Elite')]")).click();
			WebElement clickfunction4;
			clickfunction4 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customhealth-business-elite-search-bar-container-actions-submit']"));
			JavascriptExecutor executor4 = (JavascriptExecutor) driver;
			executor4.executeScript("arguments[0].click();", clickfunction4);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site Health Business Elite result Page [4.0.1.109b]");

			// PUBMED
			driver.findElement(By.xpath("//strong[contains(text(),'PubMed')]")).click();
			Thread.sleep(2000);
			WebElement clickfunction5;
			clickfunction5 = driver.findElement(
					By.xpath("//input[@id='edit-search-form-pubmed-search-bar-container-actions-submit']"));
			JavascriptExecutor executor5 = (JavascriptExecutor) driver;
			executor5.executeScript("arguments[0].click();", clickfunction5);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site PubMed result Page [4.0.1.109b]");

			// SEARCH ALL
			driver.findElement(By.xpath("//strong[contains(text(),'Search All')]")).click();

			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).clear();

			// 2nd checkpoint
			eyes.checkWindow("-UAT- Page-2");
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']"))
					.sendKeys("Medicine");
			Thread.sleep(10000);
			WebElement clickfunction7;
			clickfunction7 = driver
					.findElement(By.cssSelector("#edit-search-form-bento-search-bar-container-actions-submit"));
			JavascriptExecutor js22 = (JavascriptExecutor) driver;
			js22.executeScript("arguments[0].click();", clickfunction7);
			Thread.sleep(19000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Search All results 4.0.1.109b - Page-3");
			WebElement clickfnJournals;
			clickfnJournals = driver.findElement(By.xpath("//a[contains(text(),'Journals - 10,000')]"));
				JavascriptExecutor Journalsexe = (JavascriptExecutor) driver;
				Journalsexe.executeScript("arguments[0].click();", clickfnJournals);
			Thread.sleep(6000);
			// 4th
			eyes.checkWindow("-UAT- Journals Results 4.0.1.109b - Page-4");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// 5th
			eyes.checkWindow("-UAT- 4.0.1.109b - Page-5");
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,1000)");
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].click();", eleYellowLast);
			// 6th
			eyes.checkWindow("-UAT- 4.0.1.109b - Page-6");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
