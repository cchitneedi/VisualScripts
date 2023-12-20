package Medical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StillwaterMedicalCenter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		Eyes eyes = new Eyes();
		//Chitneedi.charan@gmail.com
		eyes.setApiKey("79CYkxosb3KQJmYhkQhA4CLfGDeI9a62992l60V8LmyU110"); 
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "STILLWATER MEDICAL CENTER", "4.0.105d-STILLWATER		");
			// -UAT-- URL
			//driver.get("https://ns008507.ebscomedical.com/");
			// -UAT-- URL
			driver.get("https://uat-nvcvooy-dwfyh6ngncrl4.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("-UAT- SITE home page [4.0.105d]");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(5000);
			// 2nd checkpoint
			eyes.checkWindow("-UAT- SITE LAST HOME page [4.0.105d]");

			// Search All Results
			WebElement search;
			
			
			search = driver.findElement(By.xpath("//header/div[@id='stacks-search-bar-block']/div[1]/form[1]/div[1]/ul[1]/li[1]/a"));
			
			JavascriptExecutor searchAll = (JavascriptExecutor) driver;
			searchAll.executeScript("arguments[0].click();", search);
			
			
			
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']"))
					.sendKeys("Medicine");
			Thread.sleep(2000);

			WebElement clickfunction;
			clickfunction = driver
					.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-actions-submit']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site SEARCH ALL result Page [4.0.105d]");

			// CINAHL
			driver.findElement(By.xpath("//strong[contains(text(),'CINAHL')]")).click();
			WebElement clickfunction2;
			clickfunction2 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-custommyhealth-alberta-search-bar-container-actions-submit']"));
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction2);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site CINAHL result Page [4.0.105d]");

			
			
			

			// JOURNALS
			driver.findElement(By.xpath("//strong[contains(text(),'Journals')]")).click();
			WebElement clickfunctionJ;
			clickfunctionJ = driver.findElement(
					By.xpath("//input[@id='edit-search-form-publicationiq-search-bar-container-actions-submit']"));
			JavascriptExecutor executorJ = (JavascriptExecutor) driver;
			executorJ.executeScript("arguments[0].click();", clickfunctionJ);
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- Site Journals result Page [4.0.105d]");

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
			eyes.checkWindow("-UAT- Site PubMed result Page [4.0.105d]");

			// SEARCH ALL
			driver.findElement(By.xpath("//header/div[@id='stacks-search-bar-block']/div[1]/form[1]/div[1]/ul[1]/li[1]/a")).click();

			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).clear();

			// 2nd checkpoint
			eyes.checkWindow("-UAT- 4.0.105d - Page-2");
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
			eyes.checkWindow("-UAT- Search All results 4.0.105d - Page-3");
			WebElement clickfnJournals;
			clickfnJournals = driver.findElement(By.xpath("//a[contains(text(),'Journals - 9,958')]"));
			JavascriptExecutor Journalsexe = (JavascriptExecutor) driver;
			Journalsexe.executeScript("arguments[0].click();", clickfnJournals);
			Thread.sleep(6000);
			// 4th
			eyes.checkWindow("-UAT- Journals Results 4.0.105d - Page-4");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// 5th
			eyes.checkWindow("-UAT- 4.0.105d - Page-5");
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,1000)");
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].click();", eleYellowLast);
			// 6th
			eyes.checkWindow("-UAT- 4.0.105d - Page-6");
			
		}
		 finally {
				driver.quit();
				eyes.abortIfNotClosed();
			}

	}

}
