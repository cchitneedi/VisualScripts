package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NORTHEAST_GEORGIA {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		eyes.setApiKey("79CYkxosb3KQJmYhkQhA4CLfGDeI9a62992l60V8LmyU110");
		driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "NORTHEAST GEORGIA HEALTH SYSTEM INC  4.0.102c", "4.0.102c-NORTHEAST_GEORGIA");
			// Master URL
			//driver.get("https://s5768257.ebscomedical.com");
			// -UAT- URL
			driver.get("https://uat-nvcvooy-y5n55tz3i6uo6.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("-UAT- Home Page 4.0.102c");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(3000);
			// 2nd checkpoint
			eyes.checkWindow("-UAT- Last Page 4.0.102c");

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
			eyes.checkWindow("-UAT- Site EBSCO result Page [4.0.102c]");

			// CINAHL
			driver.findElement(By.xpath("//strong[contains(text(),'CINAHL')]")).click();
			WebElement clickfunction2;
			clickfunction2 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-custommyhealth-alberta-search-bar-container-actions-submit']"));
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction2);
			Thread.sleep(5000);
			// 3rd checkpoint
			//eyes.checkWindow("-UAT- Site CINAHL result Page [4.0.102c]");

			// MEDLINE
			driver.findElement(By.xpath("//strong[contains(text(),'MEDLINE')]")).click();
			WebElement clickfunction3;
			clickfunction = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customgoogle-scholar-search-bar-container-actions-submit']"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site MEDLINE result Page [4.0.102c]");

			// Nursing Reference Center Plus
			driver.findElement(By.xpath("//strong[contains(text(),'Nursing Reference Center Plus')]")).click();
			WebElement clickfunction5;
			clickfunction5 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customovid-ds-search-bar-container-actions-submit']"));
			JavascriptExecutor executor5 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction5);
			Thread.sleep(5000);
			// 4th checkpoint
			//eyes.checkWindow("-UAT- Site Nursing Reference Center Plus result Page [4.0.102c]");

			// Rehabilitation Reference Center
			driver.findElement(By.xpath("//strong[contains(text(),'Rehabilitation Reference Center')]")).click();
			WebElement clickfunctionJ;
			clickfunctionJ = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customrehabilitation-reference-center-search-bar-container-actions-submit']"));
			JavascriptExecutor executorJ = (JavascriptExecutor) driver;
			executorJ.executeScript("arguments[0].click();", clickfunctionJ);
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- Site Rehabilitation Reference Center result Page [4.0.102c]");

			// eBook Clinical Collection
			driver.findElement(By.xpath("//strong[contains(text(),'eBook Clinical Collection')]")).click();
			WebElement clickfunctionPM;
			clickfunctionPM = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customebook-clinical-collection-search-bar-container-query']"));
			JavascriptExecutor executorPM = (JavascriptExecutor) driver;
			executorPM.executeScript("arguments[0].click();", clickfunctionPM);
			Thread.sleep(5000);
			// 3rd checkpoint
			//eyes.checkWindow("-UAT- Site eBook Clinical Collection result Page [4.0.102c]");

			// PUBMED
			driver.findElement(By.xpath("//strong[contains(text(),'PubMed')]")).click();
			Thread.sleep(2000);
			WebElement clickfunctionPub;
			clickfunctionPub = driver.findElement(
					By.xpath("//input[@id='edit-search-form-pubmed-search-bar-container-actions-submit']"));
			JavascriptExecutor executorPub = (JavascriptExecutor) driver;
			executorPub.executeScript("arguments[0].click();", clickfunctionPub);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site PubMed result Page [4.0.102c]");
			
			
			

			driver.findElement(By.xpath("//strong[contains(text(),'Search All')]")).click();

			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).clear();

			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']"))
					.sendKeys("Equatorial Guinea.");
			Thread.sleep(1000);
			WebElement clickfunction6;
			clickfunction6 = driver
					.findElement(By.cssSelector(".submit.expanded.button.js-form-submit.form-submit.focus-input"));
			JavascriptExecutor executor6 = (JavascriptExecutor) driver;
			executor6.executeScript("arguments[0].click();", clickfunction6);
			Thread.sleep(9000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Search Yellow Fever Result Page 4.0.102cd");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3500)");
			WebElement gdfgdsf = driver.findElement(By.xpath("//a[contains(text(),'PubMed - 728')]"));
			gdfgdsf.click();
			Thread.sleep(6000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- CINAHL Results page 4.0.102c");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// 5th
			eyes.checkWindow("-UAT- Grid View Results Page 4.0.102cd");

			driver.findElement(By.xpath(
					"//body/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/h2[1]/a[1]"))
					.click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			Thread.sleep(3000);
			// 6th checkpoint
			//eyes.checkWindow("-UAT- ARTICLE Results Page 4.0.102c");
			driver.navigate().back();

			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(3000);
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(4000);
			// 7th
			eyes.checkWindow("-UAT- Last Results Page 4.0.102c");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
