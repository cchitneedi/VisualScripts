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

public class CDN_Clone_Medpm_Demo {

	public static void main(String[] args) throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Eyes eyes = new Eyes();
		eyes.setApiKey("U7sd0gV48usZ4bzkwcPsAs104X10619109icnq7fzBdCqvABU110");
		driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "CDN Clone Medpm 4.0.102MASTER", "CDN-4.0.102MASTER");
			//driver.get("https://medpmdemo.stacksplatform.com");
			driver.get("https://uat-nvcvooy-2jhh744dtwbgi.us-3.platformsh.site/");
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("-UAT- 4.0.102c - Page-1");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("arguments[0].click();", ele);
			Thread.sleep(5000);
			
			
			//EBSCO
			driver.findElement(By.xpath("//strong[contains(text(),'EBSCO')]")).click();
			driver.findElement(By.xpath(
					"//input[@id='edit-search-form-eds-search-bar-container-query']"))
					.sendKeys("Medicine");
			Thread.sleep(2000);
			
			WebElement clickfunction;
			clickfunction = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-eds-search-bar-container-actions-submit']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site EBSCO result Page [4.0.102c]");
			
			
			
			// DYNAMED
			driver.findElement(By.xpath("//strong[contains(text(),'DynaMed')]")).click();
			Thread.sleep(2000);
			WebElement clickfunction1;
			clickfunction1 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-medsapi-search-bar-container-actions-submit']"));
			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor1.executeScript("arguments[0].click();", clickfunction1);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site DynaMed result Page [4.0.102c]");
			
			
			
			//DYNAMIC HEALTH
			driver.findElement(By.xpath("//strong[contains(text(),'Dynamic Health')]")).click();
			WebElement clickfunction2;
			clickfunction2 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-dynamic-health-search-bar-container-actions-submit']"));
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor2.executeScript("arguments[0].click();", clickfunction2);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site Dynamic Health result Page [4.0.102c]");
			
			
			//JOURNALS
			driver.findElement(By.xpath("//strong[contains(text(),'Journals')]")).click();
			WebElement clickfunction3;
			clickfunction3 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-publicationiq-search-bar-container-actions-submit']"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click();", clickfunction3);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site Journals result Page [4.0.102c]");
			
			
			
			//PUBMED
			driver.findElement(By.xpath("//strong[contains(text(),'PubMed')]")).click();
			Thread.sleep(2000);
			WebElement clickfunction4;
			clickfunction4 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-pubmed-search-bar-container-actions-submit']"));
			JavascriptExecutor executor4 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction4);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site PubMed result Page [4.0.102c]");
			
			
			//SEARCH ALL
			driver.findElement(By.xpath("//strong[contains(text(),'All')]")).click();
			
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).clear();
			
			
			// 2nd checkpoint
			eyes.checkWindow("-UAT- 4.0.102c - Page-2");
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']"))
					.sendKeys("Medicine");
			Thread.sleep(10000);
			WebElement clickfunction5;
			clickfunction5 = driver
					.findElement(By.cssSelector("#edit-search-form-bento-search-bar-container-actions-submit"));
			JavascriptExecutor js22 = (JavascriptExecutor) driver;
			js22.executeScript("arguments[0].click();", clickfunction5);
			Thread.sleep(15000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- 4.0.102c - Page-3");
			driver.findElement(By.xpath("//a[contains(text(),'Nursing eBooks - 746')]")).click();
			Thread.sleep(6000);
			//4th
			eyes.checkWindow("-UAT- 4.0.102c - Page-4");
			driver.findElement(By.xpath("//button[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			//5th
			eyes.checkWindow("-UAT- 4.0.102c - Page-5");
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,1000)");
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].click();", eleYellowLast);
			//6th
			eyes.checkWindow("-UAT- 4.0.102c - Page-6");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
