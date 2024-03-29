package visualRegression.QA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NorthCountryHealthCare {

	public static void main(String[] args) throws InterruptedException {


		
//		
//		 WebDriverManager.chromedriver().setup();
//		 ChromeOptions options = new ChromeOptions();
//		 options.addArguments("--remote-allow-origins=*");
//		 DesiredCapabilities cp = new DesiredCapabilities();
//		 cp.setCapability(ChromeOptions.CAPABILITY, options);
//		 options.merge(cp);
//		 
//		 driver = new ChromeDriver(options);
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		Eyes eyes = new Eyes();
		//chrantrent@gmail.com			
		eyes.setApiKey("LZLxPWPBvOSNYFXKIUS8o7cKrgRhQwjWZnMvd104jAtyI110");
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "NORTH COUNTRY HEALTH CARE 4.0.108.1", "4.0.108.1-NORTHCOUNTRYHEALTH");
			// -UAT- URL
			//driver.get("https://ns260564.ebscomedical.com");
			// -UAT- URL
			driver.get("https://uat-nvcvooy-ouofirtnmihi2.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("-UAT- SITE home page [4.0.108.1]");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(5000);
			// 2nd checkpoint
			eyes.checkWindow("-UAT- SITE LAST HOME page [4.0.108.1]");
			

			// CINAHL
			driver.findElement(By.xpath("//strong[contains(text(),'CINAHL')]")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-stacks-external-catalogs-custommyhealth-alberta-search-bar-container-query']")).sendKeys("Medicine");
			Thread.sleep(2000);
			WebElement clickCINAHLFnc;
			clickCINAHLFnc = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-custommyhealth-alberta-search-bar-container-actions-submit']"));
			JavascriptExecutor executorCINAHL = (JavascriptExecutor) driver;
			executorCINAHL.executeScript("arguments[0].click();", clickCINAHLFnc);
			Thread.sleep(5000);
			// 3rd checkpoint
			 eyes.checkWindow("-UAT- Site CINAHL result Page [4.0.108.1]");

			// Nursing eBooks
			driver.findElement(By.xpath("//strong[contains(text(),'Nursing eBooks')]")).click();
			WebElement clickfunction5;
			clickfunction5 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customovid-ds-search-bar-container-actions-submit']"));
			JavascriptExecutor executorNursing = (JavascriptExecutor) driver;
			executorNursing.executeScript("arguments[0].click();", clickfunction5);
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- Site Nursing eBooks result Page [4.0.108.1]");

			// PUBMED
			driver.findElement(By.xpath("//strong[contains(text(),'PubMed')]")).click();
			Thread.sleep(2000);
			WebElement clickPubMedFnc;
			clickPubMedFnc = driver.findElement(
					By.xpath("//input[@id='edit-search-form-pubmed-search-bar-container-actions-submit']"));
			JavascriptExecutor executor5 = (JavascriptExecutor) driver;
			executor5.executeScript("arguments[0].click();", clickPubMedFnc);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site PubMed result Page [4.0.108.1]");

			// SEARCH ALL
			driver.findElement(By.xpath("//strong[contains(text(),'Search All')]")).click();

			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).clear();

			// 2nd checkpoint
			eyes.checkWindow("-UAT- 4.0.108.1 - Page-2");
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
			eyes.checkWindow("-UAT- Search All results 4.0.108.1 - Page-3");
			WebElement clickfnJournals;
			//10,000 - UAT
			clickfnJournals = driver.findElement(By.xpath("//a[contains(text(),'Journals - 10,000')]"));
			JavascriptExecutor Journalsexe = (JavascriptExecutor) driver;
			Journalsexe.executeScript("arguments[0].click();", clickfnJournals);
			Thread.sleep(6000);
			// 4th
			// eyes.checkWindow("-UAT- Journals Results 4.0.108.1 - Page-4");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// 5th
			eyes.checkWindow("-UAT- 4.0.108.1 - Page-5");
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,1000)");
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].click();", eleYellowLast);
			// 6th
			eyes.checkWindow("-UAT- 4.0.108.1 - Page-6");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
