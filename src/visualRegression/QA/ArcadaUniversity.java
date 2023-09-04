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

public class ArcadaUniversity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// cchitneedi@ebsco.com
		Eyes eyes = new Eyes();
		eyes.setApiKey("UFnibMBf5106107SunPp98oA3nC7WYox3qiX68oZQsVMdDdc110");
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		try {
			eyes.open(driver, "ARCADA-UNIVERSITY [4.0.101e]", "4.0.101e-ARCADA");
			// -UAT-- URL
			//driver.get("https://s4777400.ebscomedical.com");
			// -UAT-- URL
			driver.get("https://uat-nvcvooy-4gy4pwqtnsva4.eu-5.platformsh.site/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// 1st checkpoint
			eyes.checkWindow(" Home Page 4.0.101e");

			WebElement ele;
			ele = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			ele.click();
			Thread.sleep(5000);
			// 2nd checkpoint
			eyes.checkWindow("-UAT- Last Page 4.0.101e");

			
			//EBSCO
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
			eyes.checkWindow("-UAT- Site EBSCO result Page [4.0.101e]");
			
			

			//CINAHL with Full Text
			driver.findElement(By.xpath("//strong[contains(text(),'CINAHL with Full Text')]")).click();
			WebElement clickfunction2;
			clickfunction = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-custommyhealth-alberta-search-bar-container-actions-submit']"));
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site CINAHL result Page [4.0.101e]");
			
			

			//MEDLINE
			driver.findElement(By.xpath("//strong[contains(text(),'MEDLINE')]")).click();
			WebElement clickfunction3;
			clickfunction = driver.findElement(By.xpath(
					"//input[@id='edit-search-form-stacks-external-catalogs-customgoogle-scholar-search-bar-container-actions-submit']"));
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site MEDLINE result Page [4.0.101e]");

			
			//PubMed
			driver.findElement(By.xpath("//strong[contains(text(),'PubMed')]")).click();
			WebElement clickfunction4;
			clickfunction = driver.findElement(
					By.xpath("//input[@id='edit-search-form-pubmed-search-bar-container-actions-submit']"));
			JavascriptExecutor executor4 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Site PubMed result Page [4.0.101e]");

			driver.findElement(By.xpath("//strong[contains(text(),'Search All')]")).click();
			WebElement clickfunction5;
			clickfunction = driver
					.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']"));
			JavascriptExecutor executor5 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(5000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- Site Search All result Page [4.0.101e]");

			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).click();
			driver.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']")).clear();

			WebElement asasdas = driver
					.findElement(By.xpath("//input[@id='edit-search-form-bento-search-bar-container-query']"));
			asasdas.sendKeys("Yellow fever – Gabon");
			Thread.sleep(3000);
			WebElement clickfunction6;
			clickfunction = driver
					.findElement(By.cssSelector(".submit.expanded.button.js-form-submit.form-submit.focus-input"));
			JavascriptExecutor executor6 = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", clickfunction);
			Thread.sleep(15000);
			// 3rd checkpoint
			eyes.checkWindow("-UAT- Search Yellow Fever Result Page 4.0.101e");

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,4000)");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'See 20 more')]")).click();
			Thread.sleep(5000);
			// -UAT--
			// driver.findElement(By.xpath("//body/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/button[1]/span[1]")).click();
			Thread.sleep(2000);
			// 4th checkpoint
			eyes.checkWindow("-UAT- Pubmed Results page2 4.0.101e");
			driver.findElement(By.xpath("//a[@aria-label='grid view']")).click();
			Thread.sleep(5000);
			// 5th
			eyes.checkWindow("-UAT- Grid View Results Page 4.0.101e");

			driver.findElement(By.xpath("//a[contains(text(),'Equatorial Guinea.')]")).click();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			Thread.sleep(5000);
			// 6th checkpoint
			eyes.checkWindow("-UAT- Equatorial Results Page 4.0.101e");
			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(5000);
			WebElement eleYellowLast;
			eleYellowLast = driver.findElement(By.xpath("//span[contains(text(),'Last »')]"));
			executor.executeScript("arguments[0].click();", eleYellowLast);
			Thread.sleep(6000);
			// 7th
			eyes.checkWindow("-UAT- Last Results Page 4.0.101e");
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
		}

	}

}
