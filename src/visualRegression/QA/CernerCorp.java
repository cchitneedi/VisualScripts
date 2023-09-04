package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CernerCorp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		eyes.setApiKey("U7sd0gV48usZ4bzkwcPsAs104X10619109icnq7fzBdCqvABU110");
		driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "CERNER CORP 4.0.101a", "4.0.101a-CernerCorp");
			// Master URL
			//driver.get("https://s4900165.ebscomedical.com");
			// -UAT- URL
			driver.get("https://uat-nvcvooy-oopowsptha2qg.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("-UAT- Home Page 4.0.101a");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(3000);
			// 2nd checkpoint
			eyes.checkWindow("-UAT- Last Page 4.0.101a");

			// EBSCO
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
			eyes.checkWindow("-UAT- Site EBSCO result Page [4.0.101a]");

			// CINAHL Ultimate
			driver.findElement(By.xpath("//strong[contains(text(),'CINAHL Ultimate')]")).click();
			WebElement clickfunction2;
			clickfunction2 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-custommyhealth-alberta-search-bar-container-actions-submit']"));
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction2);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site CINAHL Ultimate result Page [4.0.101a]");

			// Medline Complete Results
			driver.findElement(By.xpath("//strong[contains(text(),'MEDLINE Complete')]")).click();
			WebElement clickfunction6;
			clickfunction6 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customgoogle-scholar-search-bar-container-actions-submit']"));
			JavascriptExecutor executor6 = (JavascriptExecutor) driver;
			executor6.executeScript("arguments[0].click();", clickfunction6);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site MEDLINE COMPLETE result Page [4.0.101a]");

			
			// PubMed
			driver.findElement(By.xpath("//strong[contains(text(),'PubMed')]")).click();
			WebElement clickfunctionPM;
			clickfunctionPM = driver.findElement(
					By.xpath("//input[@id='edit-search-form-pubmed-search-bar-container-actions-submit']"));
			JavascriptExecutor executorPM = (JavascriptExecutor) driver;
			executorPM.executeScript("arguments[0].click();", clickfunctionPM);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site PubMed result Page [4.0.101a]");

			driver.findElement(By.xpath("//strong[contains(text(),'Search All')]")).click();

			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).clear();

			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']"))
					.sendKeys("Equatorial Guinea.");
			Thread.sleep(1000);
			WebElement clickfunctionSA;
			clickfunctionSA = driver
					.findElement(By.cssSelector(".submit.expanded.button.js-form-submit.form-submit.focus-input"));
			JavascriptExecutor executorSA = (JavascriptExecutor) driver;
			executorSA.executeScript("arguments[0].click();", clickfunctionSA);
			Thread.sleep(16000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Search Yellow Fever Result Page 4.0.101a");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3500)");
			WebElement gdfgdsf = driver.findElement(By.xpath("//a[contains(text(),'See 718 more')]"));
			gdfgdsf.click();
			Thread.sleep(6000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- CINAHL Results page 4.0.101a");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// 5th
			eyes.checkWindow("-UAT- Grid View Results Page 4.0.101a");

			driver.findElement(By.xpath(
					"//body/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/h2[1]/a[1]"))
					.click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			Thread.sleep(3000);
			// 6th checkpoint
			eyes.checkWindow("-UAT- ARTICLE Results Page 4.0.101a");
			driver.navigate().back();

			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(3000);
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(4000);
			// 7th
			eyes.checkWindow("-UAT- Last Results Page 4.0.101a");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
