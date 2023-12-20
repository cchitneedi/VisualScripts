package Medical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ESKENAZI_HEALTH {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		Eyes eyes = new Eyes();
		//Azeez
		eyes.setApiKey("76jdjWTXH106Aw9XSAsZg2A7X39YDYFUsg9x101Hyjq106lCk110"); 
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "ESKENAZI HEALTH", "ESKENAZI HEALTH - 4.0.106b");
			// -UAT--- URL
			//driver.get("https://s2525621.ebscomedical.com/");
			// -UAT--- URL
			driver.get("https://uat-nvcvooy-k64o2dlp3t6kg.us-3.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow("-UAT- SITE home page [4.0.106b]");
			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(5000);
			// 2nd checkpoint
			eyes.checkWindow("-UAT- SITE LAST HOME page [4.0.106b]");

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
			Thread.sleep(9000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site EBSCO result Page [4.0.106b]");

			
			
			
			// CINAHL
			driver.findElement(By.xpath("//strong[contains(text(),'CINAHL')]")).click();
			WebElement clickfunction2;
			clickfunction2 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-custommyhealth-alberta-search-bar-container-actions-submit']"));
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction2);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site CINAHL result Page [4.0.106b]");

			
			
			
			// MEDLINE
			driver.findElement(By.xpath("//strong[contains(text(),'MEDLINE')]")).click();
			WebElement clickfunction3;
			clickfunction = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customgoogle-scholar-search-bar-container-actions-submit']"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site MEDLINE result Page [4.0.106b]");

			
			
			
			// Health Business Elite
			driver.findElement(By.xpath("//strong[contains(text(),'Health Business Elite')]")).click();
			WebElement clickfunction4;
			clickfunction4 = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customhealth-business-elite-search-bar-container-actions-submit']"));
			JavascriptExecutor executor4 = (JavascriptExecutor) driver;
			executor4.executeScript("arguments[0].click();", clickfunction4);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site Health Business Elite result Page [4.0.106b]");
			
			
			
			
			//Psych & Behavioral Sciences
			driver.findElement(By.xpath("//strong[contains(text(),'Psych & Behavioral Sciences')]")).click();
			WebElement clickfunctionPsych;
			clickfunctionPsych = driver.findElement(
					By.xpath("//input[@id='edit-search-form-stacks-external-catalogs-custompsychology-and-behavioral-sciences-collection-search-bar-container-actions-submit']"));
			JavascriptExecutor executorPsych = (JavascriptExecutor) driver;
			executorPsych.executeScript("arguments[0].click();", clickfunctionPsych);
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- Site Psych & Behavioral Sciences result Page [4.0.106b]");
			
			
			
			
			

			// JOURNALS
			driver.findElement(By.xpath("//strong[contains(text(),'Journals')]")).click();
			WebElement clickfunctionJ;
			clickfunctionJ = driver.findElement(
					By.xpath("//input[@id='edit-search-form-publicationiq-search-bar-container-actions-submit']"));
			JavascriptExecutor executorJ = (JavascriptExecutor) driver;
			executorJ.executeScript("arguments[0].click();", clickfunctionJ);
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- Site Journals result Page [4.0.106b]");

			
			
			
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
			eyes.checkWindow("-UAT- Site PubMed result Page [4.0.106b]");

			
			
			
			// SEARCH ALL
			driver.findElement(By.xpath("//strong[contains(text(),'Search All')]")).click();

			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).clear();

			// 2nd checkpoint
			eyes.checkWindow("-UAT- 4.0.106b - Page-2");
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
			eyes.checkWindow("-UAT- Search All results 4.0.106b - Page-3");
			WebElement clickfnJournals;
			clickfnJournals = driver.findElement(By.xpath("//a[contains(text(),'Journals - 9,983')]"));
			JavascriptExecutor Journalsexe = (JavascriptExecutor) driver;
			Journalsexe.executeScript("arguments[0].click();", clickfnJournals);
			Thread.sleep(6000);
			// 4th
			eyes.checkWindow("-UAT- Journals Results 4.0.106b - Page-4");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(2000);
			// 5th
			eyes.checkWindow("-UAT- 4.0.106b - Page-5");
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,1000)");
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].click();", eleYellowLast);
			// 6th
			eyes.checkWindow("-UAT- 4.0.106b - Page-6");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}
		
		
		
		
		

	}

}
